package com.aartek.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Registration;

@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public ArrayList<Registration> saveLoginRepo(Registration regis)
	{
		
		System.out.println("inside repository");
		System.out.println(regis.getFirst_name()+"  "+regis.getLast_name());	
		ArrayList<Registration> login = new ArrayList<Registration>();
		login=null;
		hibernateTemplate.save(regis);
		login = (ArrayList<Registration>) hibernateTemplate.loadAll(Registration.class);
		ArrayList<Registration> reg=(ArrayList<Registration>)login;
		System.out.println("after getting data ");
		
		
		
		return reg;
		

	}
}
