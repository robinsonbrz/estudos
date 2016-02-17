package br.com.vivo.xereta.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.vivo.xereta.model.Logeai;

@SuppressWarnings("unchecked")
public class LogeaiDAO {

	public List<Logeai> pesquisarPorTrackingId(EntityManager em, String trackingId, BigDecimal dia, String soaTag) {

		if (soaTag == null && dia == null) {

			Query query = em.createQuery("SELECT l FROM Logeai l where l.trackingid = :pTrackingId");
			query.setParameter("pTrackingId", trackingId);

			return query.getResultList();

		} else if (soaTag != null && dia == null) {

			Query query = em
					.createQuery("SELECT l FROM Logeai l where l.trackingid = :pTrackingId and l.soatag = :pSoaTag");
			query.setParameter("pTrackingId", trackingId);
			query.setParameter("pSoaTag", soaTag);

			return query.getResultList();

		} else if (soaTag == null && dia != null) {

			Query query = em.createQuery("SELECT l FROM Logeai l where l.trackingid = :pTrackingId and l.dia = :pDia");
			query.setParameter("pTrackingId", trackingId);
			query.setParameter("pDia", dia);

			return query.getResultList();

		} else {

			Query query = em.createQuery(
					"SELECT l FROM Logeai l where l.trackingid = :pTrackingId and l.soatag = :pSoaTag and l.dia = :pDia");
			query.setParameter("pTrackingId", trackingId);
			query.setParameter("pSoaTag", soaTag);
			query.setParameter("pDia", dia);

			return query.getResultList();

		}
	}

	public List<Logeai> consultarTodosLogs(EntityManager em) {
		Query query = em.createQuery("Select l from Logeai l");
		return query.getResultList();
	}

}
