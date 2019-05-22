package co.edu.uniajc.CajeroAutomatico.DAO;
// Generated 7/04/2019 02:10:16 PM by Hibernate Tools 5.1.10.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import co.edu.uniajc.CajeroAutomatico.model.TipoIdentificacion;

/**
 * Home object for domain model class TipoIdentificacion.
 * @see co.edu.uniajc.CajeroAutomatico.Daos.TipoIdentificacion
 * @author Hibernate Tools
 */
public class TipoIdentificacionHome {

	private static final Log log = LogFactory.getLog(TipoIdentificacionHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TipoIdentificacion transientInstance) {
		log.debug("persisting TipoIdentificacion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TipoIdentificacion instance) {
		log.debug("attaching dirty TipoIdentificacion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TipoIdentificacion instance) {
		log.debug("attaching clean TipoIdentificacion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TipoIdentificacion persistentInstance) {
		log.debug("deleting TipoIdentificacion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TipoIdentificacion merge(TipoIdentificacion detachedInstance) {
		log.debug("merging TipoIdentificacion instance");
		try {
			TipoIdentificacion result = (TipoIdentificacion) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TipoIdentificacion findById(java.lang.Integer id) {
		log.debug("getting TipoIdentificacion instance with id: " + id);
		try {
			TipoIdentificacion instance = (TipoIdentificacion) sessionFactory.getCurrentSession()
					.get("co.edu.uniajc.CajeroAutomatico.Daos.TipoIdentificacion", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TipoIdentificacion instance) {
		log.debug("finding TipoIdentificacion instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("co.edu.uniajc.CajeroAutomatico.Daos.TipoIdentificacion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
