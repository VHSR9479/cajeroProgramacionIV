package co.edu.uniajc.CajeroAutomatico.Service;
import java.io.Serializable;
import java.util.List;

import co.edu.uniajc.CajeroAutomatico.DAO.BancoDAO;

import co.edu.uniajc.CajeroAutomatico.DAO.ImpBancoDAO;
import co.edu.uniajc.CajeroAutomatico.model.Banco;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//@Service("BancoService")
//@Transactional(readOnly = true)
public class BancoServiceImp implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private ImpBancoDAO bancoDao;
//    // CustomerDAO is injected...
//    @Autowired
//    ImpBancoDAO bancoDAO;
	
	public BancoServiceImp(Session session) {
		
		bancoDao = new ImpBancoDAO(session);
	
	}

	public void addBanco(Banco banco) {
		bancoDao.addBanco(banco);
	}

	
	
	public ImpBancoDAO getBancoDao() {
		return bancoDao;
	}

	public void setBancoDao(ImpBancoDAO bancoDao) {
		this.bancoDao = bancoDao;
	}

	public void closeSession(){
		bancoDao.closeSession();
	}

}