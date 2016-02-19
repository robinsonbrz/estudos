package br.com.vivo.xereta.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.vivo.xereta.dao.LogeaiDAO;
import br.com.vivo.xereta.model.Logeai;
import br.com.vivo.xereta.util.JPAUtil;

@ManagedBean(name = "logeai")
@RequestScoped
public class LogeaiBean {
	
	EntityManager em = JPAUtil.getEntityManager();
	LogeaiDAO dao = new LogeaiDAO();
	
	public List<Logeai> getAllLogs(){
		return dao.pesquisarPorTrackingId(em, "151000093698", null, null);
	}
	
	
}
