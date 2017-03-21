import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory; 
	
	static { 
		try { 
			BeanFactory factory = new ClassPathXmlApplicationContext("config/applicationContext-common.xml");  
			sessionFactory = (SessionFactory)factory.getBean("sessionFactory"); 
		} catch (HibernateException ex) { 
			throw new RuntimeException("Exception building SessionFactory: " 
			+ ex.getMessage(), ex); 
		} 
	} 
	
	public static final ThreadLocal session = new ThreadLocal(); 
	
	public static Session currentSession() throws HibernateException { 
		Session s = (Session) session.get(); 
		// Open a new Session, if this Thread has none yet 
		if (s == null) { 
			s = sessionFactory.openSession(); 
			session.set(s); 
		} 
		return s; 
	} 
	
	public static void closeSession() throws HibernateException { 
		Session s = (Session) session.get(); 
		session.set(null); 
		if (s != null) s.close(); 
	} 
	
}
