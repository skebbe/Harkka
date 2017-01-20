package fi.harkka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fi.harkka.model.Application;

public class ApplicationDAOImpl implements ApplicationDAO{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationDAOImpl.class);
	private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
	        this.sessionFactory = sf;
	    }
	 public void addApplication(Application a) {
			Session session = this.sessionFactory.getCurrentSession();
//			Transaction tx = session.beginTransaction();
			session.persist(a);
//			tx.commit();
//			session.close();
			logger.info("Succesfully added application:"+a);
		}
	 
	 public void updateApplication(Application a) {
		 Session session = this.sessionFactory.getCurrentSession();
		 session.update(a);
		 logger.info("Succesfully updated application:"+a);
	 }
	 
	 @SuppressWarnings("unchecked")
		public List<Application> listApplications() {
			Session session = this.sessionFactory.getCurrentSession();
			List<Application> appsList = session.createQuery("from Application").list();
			for(Application a : appsList){
				logger.info("Application List::"+a);
			}
			return appsList;
		}
	 
	 
	 public Application getApplicationById(int id){
		 Session session = this.sessionFactory.getCurrentSession();
		 Application a = (Application) session.load(Application.class, new Integer(id));
		 
		 logger.info("Succesfully loaded application:"+a);
		 
		 return a;
	 }
	 
	 public void removeApplication(int id) {
			Session session = this.sessionFactory.getCurrentSession();
			Application a = (Application) session.load(Application.class, new Integer(id));
			if(null != a){
				session.delete(a);
			}
			logger.info("Application deleted successfully, application details="+a);
		}
}
