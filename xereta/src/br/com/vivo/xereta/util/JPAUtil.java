package br.com.vivo.xereta.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private EntityManagerFactory emf;

	public EntityManager getEntityManager() {

		emf = Persistence.createEntityManagerFactory("logeai");
		return emf.createEntityManager();
	}
	public void closeEntityManager(){
		emf.close();
	}
}
