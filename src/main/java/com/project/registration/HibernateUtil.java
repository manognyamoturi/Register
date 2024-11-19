package com.project.registration;

import java.util.Properties;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionFactory = null;
	static {
	try {
	Configuration cfg = new Configuration();
	Properties myprops = new Properties();
	myprops.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/registration");
	myprops.put(Environment.USER, "root");
	myprops.put(Environment.PASS, "system@123");
	myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
	myprops.put(Environment.SHOW_SQL, "true");
	myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	myprops.put(Environment.HBM2DDL_AUTO, "update");
	cfg.setProperties(myprops);
	cfg.addAnnotatedClass(Registration.class);
	StandardServiceRegistryBuilder ssrbuilder = new StandardServiceRegistryBuilder();
	ServiceRegistry serviceRegistry = ssrbuilder.applySettings(cfg.getProperties()).build();
	sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	public static SessionFactory getSessionFactory() {
	return sessionFactory; 
	}

}
