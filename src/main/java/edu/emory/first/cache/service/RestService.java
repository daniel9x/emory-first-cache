package edu.emory.first.cache.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.emory.first.cache.model.ProfessionalActivityType;

@Path("/")
public class RestService {
	
	@Inject
    private EntityManager em;
	
	@GET
    @Path("/test")
    @Produces({ "application/json" })
    public String getTest() {
		return "Hey!";
    }

	@GET
    @Path("/professional-activity-types")
    @Produces({ "application/json" })
    public List<ProfessionalActivityType> getProfessionalActivityTypes() {
		TypedQuery<ProfessionalActivityType> query = em.createQuery("select p from ProfessionalActivityType p", ProfessionalActivityType.class);
        query.getResultList();
        List<ProfessionalActivityType> professionalActivityTypes = query.getResultList();
        return professionalActivityTypes;
    }

}
