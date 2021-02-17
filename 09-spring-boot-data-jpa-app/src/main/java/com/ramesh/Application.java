package com.ramesh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ramesh.entities.ContactsMasterEntity;
import com.ramesh.repository.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
	     
		 ContactsMasterRepo bean= ctxt.getBean(ContactsMasterRepo.class);
	     
		// bean.findContactNameByContactNumber(7588280048L);
		 
		/*
		 * List<String>names= bean.findAllContacNames(); names.forEach(name-> {
		 * System.out.println(name); });
		 */
		 
		 ContactsMasterEntity entity= bean.findByContactNameAndContactNumber("Ramesh", 7588280048L);
		 System.out.println(entity);
		 
		 
		/*
		 * ContactsMasterEntity entity= new ContactsMasterEntity();
		 * 
		 * entity.setContactId(101); entity.setContactName("Ramesh");
		 * entity.setContactNumber(758788788);
		 * entity.setContactId(102); entity.setContactName("Mahesh");
		 * entity.setContactNumber(8600869696);
		 * entity.setContactId(103); entity.setContactName("Suraj");
		 * entity.setContactNumber(9762830343);
		 
	     
	     bean.save(entity);*/
	     ctxt.close();
	}

}
