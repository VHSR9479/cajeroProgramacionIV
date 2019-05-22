package co.edu.uniajc.CajeroAutomatico.DAO;
// Generated 7/04/2019 02:10:16 PM by Hibernate Tools 5.1.10.Final

import java.io.Serializable;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;


import co.edu.uniajc.CajeroAutomatico.model.Banco;


public class ImpBancoDAO implements BancoDAO { 

	private static final long serialVersionUID = 1L;
	private Session session;
	

	public ImpBancoDAO(Session session) {
		this.session = session;
	}
	
//	public List<Banco> obtenerBancos() {
//		
//		Session session = null;
//
//		try {
//			session = sessionFactory.openSession();
//			return (List<Banco>) session.createQuery("FROM Banco").getResultList();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			if (session != null && session.isOpen()) {
//				session.close();
//				session = null;
//			}
//		}
//
//	}


    @Override
	public void addBanco(Banco banco) {

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			session.save(banco);
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}

	}

	@Override
	public List<Banco> obtenerBancos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeSession() {
		// TODO Auto-generated method stub
		
	}
    
    
	
//    public void addBanco(Banco banco) {
//        getSessionFactory().getCurrentSession().save(banco);
//    }
//    


//	public void addBanco(Banco banco) {
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			
//			session.save(banco);
//			
//			tx.commit();
//		} 
//		catch (Exception e) {
//			if(tx != null){
//				tx.rollback();
//			}
//			e.printStackTrace();
//		}
//	}

		
}
