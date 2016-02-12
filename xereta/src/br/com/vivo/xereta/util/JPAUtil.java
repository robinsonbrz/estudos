package br.com.vivo.xereta.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {

	private EntityManager em;

	public EntityManager getEntityManager() {

		em = Persistence.createEntityManagerFactory("logeai").createEntityManager();
		return em;
	}
}
