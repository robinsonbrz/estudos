package br.com.vivo.xereta.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;

import br.com.vivo.xereta.util.JPAUtil;

public class EntityManagerProducer {

	@Produces
	@RequestScoped
	public EntityManager criaEntityManager() {
		return JPAUtil.getEntityManager();
	}
}