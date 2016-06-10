package com.aartek.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Registration;
import com.aartek.model.UserLogin;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository regisRepo;
	
	public boolean saveRegistrationService(Registration regis)
	{
		
		System.out.println("Inside Service Method" +regis.getFirst_name()+" "+regis.getLast_name());
	
		Registration userMember = (Registration) regis;
			List<Registration> list = null;
			
				list=regisRepo.saveLoginRepo(regis);
				System.out.println("after service method");
				if (list.size() == 0) {
				userMember = null;
				return false;
			} else {
				userMember = (Registration) ( list.get(0));
				return true;
			}
	}
}
