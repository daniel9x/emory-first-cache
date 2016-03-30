package edu.emory.first.cache.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.emory.first.cache.model.ProfessionalActivity;

public class HibernateTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("efcEntityManagerLocal");
		EntityManager em = emf.createEntityManager();
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("select distinct p from ProfessionalActivity p ");
		sb.append("where p.user.userName = 'kgriend' ");
	 	
	 	Query query = em.createQuery(sb.toString());
	 	
	 	List<ProfessionalActivity> professionalActivities = query.getResultList();
	 	
	 	System.out.println(professionalActivities.size());
	}

}