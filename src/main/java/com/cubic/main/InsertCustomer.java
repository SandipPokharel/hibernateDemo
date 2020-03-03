package com.cubic.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cubic.entities.CustomerEntity;
import com.cubic.repositories.CustomerRepository;



public class InsertCustomer {
	
public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		CustomerRepository cr = (CustomerRepository) ctx.getBean("cRepository");
				
		
		CustomerEntity ce = new CustomerEntity();
		ce.setName("Bikash");
		ce.setEmail("Bikash@gmail.com");
		ce.setAddress("djfgskf street");
		ce.setCity("fairfax");
		ce.setState("va");
		ce.setZipcode("12456");
		
		cr.save(ce);		
		
}	

}
