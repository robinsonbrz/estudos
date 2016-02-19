package br.com.vivo.xereta.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.vivo.xereta.dao.LogeaiDAO;
import br.com.vivo.xereta.model.Logeai;
import br.com.vivo.xereta.util.JPAUtil;

public class TestesDAOClass {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		long finish = 0;
		EntityManager em = JPAUtil.getEntityManager();
		LogeaiDAO dao = new LogeaiDAO();
		
		List<Logeai> logs = dao.consultarTodosLogs(em);
		
		for (Logeai logeai : logs) {
			System.out.println(logeai.getInternalid());
		}
		
		finish = System.currentTimeMillis();
		System.out.println(finish - start);
	}
}
