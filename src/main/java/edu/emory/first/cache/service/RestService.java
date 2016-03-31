package edu.emory.first.cache.service;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;

import edu.emory.first.cache.model.ProfessionalActivity;
import edu.emory.first.cache.model.ProfessionalActivityType;
import edu.emory.first.cache.model.Publication;
import edu.emory.first.cache.model.PublicationType;
import edu.emory.first.cache.model.User;
import edu.emory.first.cache.util.TestUtil;

@Path("/")
public class RestService {
	
	@Inject
    private EntityManager em;
	
	public RestService() {
		if (TestUtil.isTestMode) {
			em = new TestUtil().returnLocalEntityManager();
		}
	}
	
	@GET
	@Path("/user/{userName}")
	@Produces("text/javascript")
	public List<User> getUser(
			@PathParam("userName") String userName) {

		String whereClause = "where lower(u.userName) = :userName ";

		userName = userName.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append("select distinct u from User u ");
		sb.append(whereClause);
		TypedQuery<User> query = em.createQuery(sb.toString(), User.class);

		query.setParameter("userName", userName);

		List<User> users = query.getResultList();
		return users;
	}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTest() {
		return "Success...!";
	}

	@GET
	@Path("/professional-activity-types")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProfessionalActivityType> getProfessionalActivityTypes() {
		TypedQuery<ProfessionalActivityType> query = em.createQuery("select p from ProfessionalActivityType p", ProfessionalActivityType.class);
		query.getResultList();
		List<ProfessionalActivityType> professionalActivityTypes = query.getResultList();
		return professionalActivityTypes;
	}

	@GET
	@Path("/publication-types")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PublicationType> getPublicationTypes() {
		TypedQuery<PublicationType> query = em.createQuery("select p from PublicationType p", PublicationType.class);
		List<PublicationType> publicationTypes = query.getResultList();
		return publicationTypes;
	}

	@GET
	@Path("/user/{userName}/publications")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Publication> getUserPublications(
			@PathParam("userName") String userName, 
			@QueryParam("relationship") String relationship,
			@QueryParam("favorite") Boolean favorite) {

		List<String> filters = new ArrayList<String>();
		
		userName = userName.toLowerCase();

		String whereClause = "where lower(userName) = :userName ";

		if (relationship != null) {
			relationship = relationship.toLowerCase();
			filters.add("lower(relationshipType) = :relationship ");
		}

		if (favorite != null) {
			filters.add("isFavorite = :favorite ");
		}

		if (!filters.isEmpty()) {
			whereClause = whereClause + " and " + StringUtils.join(filters, " and ");
		}

		userName = userName.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append("select p from Publication p ");
		sb.append(whereClause);
		sb.append("order by p.publicationDate desc");
		TypedQuery<Publication> query = em.createQuery(sb.toString(), Publication.class);

		query.setParameter("userName", userName);

		if (relationship != null) {
			query.setParameter("relationship", relationship);
		}
		if (favorite != null) {
			query.setParameter("favorite", favorite);
		}

		List<Publication> userPublications = query.getResultList();
		return userPublications;
	}

	@GET
	@Path("/user/{userName}/professional-activities")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProfessionalActivity> getUserProfessionalActivities(
			@PathParam("userName") String userName, 
			@QueryParam("typeId") Integer typeId) {

		List<String> filters = new ArrayList<String>();

		String whereClause = "where lower(p.user.userName) = :userName ";

		if (typeId != null) {
			filters.add("p.typeId = :typeId ");
		}

		if (!filters.isEmpty()) {
			whereClause = whereClause + "and " + StringUtils.join(filters, " and ");
		}

		userName = userName.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append("select p from ProfessionalActivity p ");
		sb.append(whereClause);
		sb.append("order by case when (p.reportingDate1 is null and p.reportingDate2 is null) then 2 ");
	 	sb.append("when p.reportingDate2 is null then 0 ");
	 	sb.append("else 1 end asc, p.reportingDate2 desc, p.reportingDate1 desc");
		TypedQuery<ProfessionalActivity> query = em.createQuery(sb.toString(), ProfessionalActivity.class);

		query.setParameter("userName", userName);

		if (typeId != null) {
			query.setParameter("typeId", typeId);
		}

		List<ProfessionalActivity> userProfessionalActivities = query.getResultList();
		return userProfessionalActivities;
	}
	
	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON) 
	public String getBuildNumber() throws IOException, ParseException {
		String resourceName = "build.properties";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties props = new Properties();
		InputStream resourceStream = loader.getResourceAsStream(resourceName);
		props.load(resourceStream);
		String buildTimestamp = convertBuildDateFormat(props.getProperty("buildTimestamp"));
		return "<!DOCTYPE html><html><head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>"
		+ "   <link href='https://bootswatch.com/darkly/bootstrap.min.css' rel='stylesheet'/>"
		+ "   <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script>"
		+ "   <script src='https://template.emory.edu/assets/js/libraries/modernizr-2.6.2.min.js'></script>"
		+ "   <link rel='stylesheet' type='text/css' href='../style.css'>"
		+ "   <center><h1>Emory First Cache Info</h1></center>"
		+ "	  <div class='list'>"
		+ "   <ul class='list-group'>"
		+ "   <li class='list-group-item'><span class='listItemValue'>" + props.getProperty("buildNumber") + "</span> Build Number:</li>"
		+ "   <li class='list-group-item'><span class='listItemValue'>" + buildTimestamp + "</span> Last Build:</li>"
		+ "   </ul>";
	}


	public String convertBuildDateFormat(String dateString) {
		try {
			Date rawBuildDate = new SimpleDateFormat("MMMMddyyyyHHmma").parse(dateString);
			String formattedDateString = new SimpleDateFormat("MMMM d, yyyy @ h:mm a").format(rawBuildDate);
			return formattedDateString;
		}
		catch (ParseException e) {
			return "[Parse Exception Thrown]";
		}
	}

}
