package com.aartek.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Registration;
import com.aartek.model.UserLogin;
import com.aartek.service.RegistrationService;
import com.aartek.validator.RegistrationValidator;



@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService regService;
	
	@Autowired
	private RegistrationValidator registrationValidator;
	
	@RequestMapping(value="/Registration", method = RequestMethod.GET)
	public String showLogin(Map<String,Object> map)
	{
		map.put("Registration", new Registration());
		System.out.println("inside view page");
		return "registration";
	}
	
	@RequestMapping(value = "/saveRegistration", method = { RequestMethod.POST,RequestMethod.GET})
	public String saveUser(@ModelAttribute("Registration") Registration registration,BindingResult result,ModelMap m)
	{
		System.out.println("inside registration controller");
		System.out.println(registration.getFirst_name());
		
		registrationValidator.validate(registration, result);
		if(result.hasErrors())
		{
			return "registration";
		}
		
		boolean status=regService.saveRegistrationService(registration);
		System.out.println(status);
		if(status==false)
		{
			Map<String, String> map=new HashMap<String,String>();
			map.put("unsucessfull"," Registration fail");
			System.out.println("after controller");
			return "registration";

		}
		else
		{
			
			System.out.println("inside registration");
			m.addAttribute("UserLogin",new UserLogin());
			return "registration";
			//return "redirect:/UserLogin.do";
		}


		}

}
