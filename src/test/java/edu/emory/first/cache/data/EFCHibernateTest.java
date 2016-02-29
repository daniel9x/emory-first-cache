package edu.emory.first.cache.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.emory.first.cache.model.ProfessionalActivityType;


public class EFCHibernateTest {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("efcEntityManagerLocal");

		EntityManager em = emf.createEntityManager();

		TypedQuery<ProfessionalActivityType> query = em.createQuery("select p from ProfessionalActivityType p", ProfessionalActivityType.class);
        query.getResultList();
        List<ProfessionalActivityType> professionalActivityTypes = query.getResultList();
		
		System.out.println(professionalActivityTypes.size());		
	}

}
