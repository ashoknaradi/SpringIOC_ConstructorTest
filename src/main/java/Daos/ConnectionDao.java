package Daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ConnectionDao {
	public Session openSession() {
		Configuration configure = new AnnotationConfiguration().configure("hibernate.cfg.xml");// config load
		SessionFactory sf = configure.buildSessionFactory();// pool of session/connection will be created
		Session session = sf.openSession();// will get one connection
		return session;
	}
}
