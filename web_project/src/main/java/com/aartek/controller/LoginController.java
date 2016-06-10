package com.aartek.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLogin;
import com.aartek.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping("/UserLogin")
	public String showLogin(Map<String,Object> map)
	{
		map.put("UserLogin", new UserLogin());
		System.out.println("inside view page");
		return "login";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("UserLogin") UserLogin login, ModelMap model)
	{
		System.out.println("inside controller");
		System.out.println(login.getEmailId()+"  "+login.getPassword());
		
		boolean status=loginService.saveLoginService(login);
		if(status==false)
		{
			model.addAttribute("invalide", "invalid username or password");
			return "login";
			
		}
		return "welcome";

	}
}

