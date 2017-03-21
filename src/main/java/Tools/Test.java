package Tools;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shy.entity.User;
import com.shy.entity.Work;

public class Test {
	
	private static void testOneToMany() {
		
		Session session = HibernateUtil.currentSession();
		
		User u = new User();
		
		u.setAge(1);
		u.setId(12);
		u.setName("ss");
		u.setPassword("pp");
		u.setSex(1);
		
		Work w1 = new Work();
		
		w1.setDate(new Date());
		w1.setId(11);
		w1.setName("ee");
		w1.setUser(u);
		
		Work w2 = new Work();
		
		w2.setDate(new Date());
		w2.setId(12);
		w2.setName("ee");
		w2.setUser(u);

		u.getDesignSet().add(w1);
		u.getDesignSet().add(w2);
		
		Transaction trx = session.beginTransaction();
		
		session.save(u);
		
		trx.commit();
		
		session.close();
	}

	public static void main(String[] args) {
		
		
	}

}
