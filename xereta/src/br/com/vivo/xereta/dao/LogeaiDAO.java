package br.com.vivo.xereta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.vivo.xereta.model.Logeai;

public class LogeaiDAO {

	public List<Logeai> pesquisarPorTrackingId(EntityManager em, String trackingId){

		Query query = em.createQuery("SELECT l FROM Logeai l where l.trackingid = :pTrackingId");
		query.setParameter("pTrackingId", trackingId);
		return query.getResultList();
	}
	
}
