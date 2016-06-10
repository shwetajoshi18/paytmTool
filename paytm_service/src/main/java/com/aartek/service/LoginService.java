package com.aartek.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserLogin;
import com.aartek.repository.LoginRepository;




@Service
public class LoginService {
	
	@Autowired 
	private LoginRepository loginRepository;

	public boolean saveLoginService(UserLogin login) {
		
		String emailId=login.getEmailId();
		String password=login.getPassword();
		System.out.println("Inside Service Method" +login.getEmailId()+" "+login.getPassword());
	
		UserLogin userMember = (UserLogin) login;
			List<Object> list = null;
			if (userMember != null) {
				
				if (emailId != null && password != null) {
					list = loginRepository.saveLoginRepo(emailId, password);

				}
			}

			if (list.size() == 0) {
				userMember = null;
				return false;
			} else {
				userMember = (UserLogin) list.get(0);
				return true;
			}
																	

		}

	}

			








