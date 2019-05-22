package co.edu.uniajc.CajeroAutomatico.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import co.edu.uniajc.CajeroAutomatico.Service.BancoServiceImp;
import co.edu.uniajc.CajeroAutomatico.Util.HibernateUtil;
import co.edu.uniajc.CajeroAutomatico.model.Banco;


public class TestJava {
	
	
	@Test
	public void test() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		BancoServiceImp BancoService = new BancoServiceImp(session);
		
		BancoService.addBanco(new Banco("141655555", "banco76681", "call9823455", "3456789866"));
				
			
	}
	
		


	

}
