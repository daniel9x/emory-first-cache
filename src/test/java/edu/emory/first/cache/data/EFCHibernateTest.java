package edu.emory.first.cache.data;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.emory.first.cache.model.ProfessionalActivityType;
import edu.emory.first.cache.util.HibernateLogUtil;


public class EFCHibernateTest {
	
	EntityManagerFactory emf;
	
	@Before
	public void init() {
		emf = Persistence.createEntityManagerFactory("efcEntityManagerLocal");
	}
	
	@After
	public void destroy(){
		emf.close();
	}
	
	@Test
	public void testConnection() {

		EntityManager em = emf.createEntityManager();

		TypedQuery<ProfessionalActivityType> query = em.createQuery("select p from ProfessionalActivityType p", ProfessionalActivityType.class);
        query.getResultList();
        List<ProfessionalActivityType> professionalActivityTypes = query.getResultList();
		
		assertNotNull(professionalActivityTypes);	
	}

}
