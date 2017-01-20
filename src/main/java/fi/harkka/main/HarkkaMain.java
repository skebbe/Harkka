package fi.harkka.main;

import java.sql.Date;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import fi.harkka.dao.ApplicationDAO;
import fi.harkka.model.Application;

/**
 * Hello world!
 *
 */


public class HarkkaMain {

	

//	static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//	static Session session = sessionFactory.getCurrentSession();
//	static Application app = new Application();

	
	public static void main(String[] args) {
//		SpringApplication.run(HarkkaMain.class, args);
//		addApplication();
//		listApplications();
		Date date = new Date(1999 - 01 - 02);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationDAO applicationDAO = context.getBean(ApplicationDAO.class);
		
		Application app = new Application();
//		app.setId(9);
		app.setFname("etunimi2");
		app.setLname("Sukunimi12");
		app.setDob(date);
		app.setApplication("sgagasgasgag1");
		app.setGender("Female");
		applicationDAO.addApplication(app);
		
		System.out.println("Application::"+app);
		
		List<Application> list = applicationDAO.listApplications();
		
		for(Application a : list) {
			System.out.println("Application list::"+a);
		}
		context.close();
	}

//	public static void addApplication() {
//		
//		Date date = new Date(1999 - 01 - 02);
//		System.out.println("Alku");
//
//		session.beginTransaction();
//
//		app.setId(9);
//		app.setFname("etunimi2");
//		app.setLname("Sukunimi12");
//		app.setDob(date);
//		app.setApplication("sgagasgasgag1");
//		app.setGender("Female");
//		System.out.println("sijotettu");
//
//		session.save(app);
//		session.getTransaction().commit();
//		System.out.println("läpi?");
//	}
//
//	public static void listApplications() {

//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			List applications = session.createQuery("FROM Application").list();
//			for (Iterator iterator = applications.iterator(); iterator
//					.hasNext();) {
//				Application application = (Application) iterator.next();
//				System.out.println("First Name: " + application.getFname());
//				System.out.println("Last Name: " + application.getLname());
//				System.out.println("Dob: " + application.getDob());
//				System.out.println("Application: "
//						+ application.getApplication());
//				System.out.println("Gender: " + application.getGender());
//
//			}
//			tx.commit();
//		} catch (HibernateException e) {
//			if (tx != null)
//				tx.rollback();
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
	}


