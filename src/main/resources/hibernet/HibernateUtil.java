package hibernet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    
    private static SessionFactory buildSessionFactory() {
        
    	try {
    		
    		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
    		return metadata.getSessionFactoryBuilder().build();
    		
    	} catch (Throwable ex){
    		System.err.println("Initial SessionFactory creation failed." + ex);
    		throw new ExceptionInInitializerError(ex);
    	}     
    	
    	/*try {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
      
            throw new ExceptionInInitializerError(ex);
        }*/
    }

   public static SessionFactory getSessionFactory() {
       return sessionFactory;
    }
}