package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLogin;

@Repository
public class LoginRepository {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<Object> saveLoginRepo(String emailId,String password)
	{
		
		System.out.println("inside repository");
		System.out.println(emailId+"  "+password);	
		List<Object> login = null;
		login = hibernateTemplate.find("from UserLogin al where al.emailId = ? and al.password = ?", emailId, password);
		return login;
		

	}
	
}
