package com.ramesh.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ramesh.entities.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

	// this method will generate query like below
	// select * from contacts_master where contact_name='name';
	public ContactsMasterEntity findByContactName(String name);

	// this method will generate query like below
	// select * from contacts_master where contact_name='name' and
	// contact_number=number;
	public ContactsMasterEntity findByContactNameAndContactNumber(String name, Long number);

	@Query("select contactName from ContactsMasterEntity")
	public List<String> findAllContacNames();

	@Query("select contactName from ContactsMasterEntity  where contactNumber=:num")
	public String findContactNameByContactNumber(Long num);

	
}
