package com.cubic.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cubic.entities.CustomerEntity;



public class CustomerRepository {
	private SessionFactory sessionFactory;

	public void save(CustomerEntity cust) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(cust);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
