package br.com.vivo.xereta.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.vivo.xereta.dao.LogeaiDAO;
import br.com.vivo.xereta.model.Logeai;
import br.com.vivo.xereta.util.JPAUtil;

public class TesteEm {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		LogeaiDAO dao = new LogeaiDAO();
		
		List<Logeai> logs = dao.pesquisarPorTrackingId(em, "151000093698");
		
		for (Logeai logeai : logs) {
			System.out.println(logeai.getSoatag());
		}
		
		em.close();
	}
}
