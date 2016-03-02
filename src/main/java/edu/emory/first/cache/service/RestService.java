package edu.emory.first.cache.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.emory.first.cache.model.ProfessionalActivityType;
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
    @Path("/test")
    @Produces({ "application/json" })
    public String getTest() {
		return "Success!";
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
