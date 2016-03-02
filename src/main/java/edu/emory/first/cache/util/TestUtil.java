package edu.emory.first.cache.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUtil {
	
	public static boolean isTestMode = false;
	
	private EntityManagerFactory emf;
	
	public EntityManager returnLocalEntityManager() {
		if (emf != null) {
			return emf.createEntityManager();
		}
		else {
			emf = Persistence.createEntityManagerFactory("efcEntityManagerLocal");
			return emf.createEntityManager();
		}
	}

}
