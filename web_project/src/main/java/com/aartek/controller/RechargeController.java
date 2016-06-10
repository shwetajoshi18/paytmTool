package com.aartek.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Recharge;
import com.aartek.service.RechargeService;


@Controller
public class RechargeController {

	@Autowired
	private RechargeService rechargeService;
	
	@RequestMapping("/Recharge")
	public String showLogin(Map<String,Object> map, Recharge recharge,ModelMap model)
	{
		map.put("Recharge", new Recharge());
		System.out.println("inside view page");
		
		List<Recharge> status=rechargeService.showRechargeService(recharge);
		if(status==null)
		{
			model.addAttribute("invalide", "no such record found");
			return "recharge";
			
		}
		model.addAttribute("status", status);
		return "recharge";
		
		
	}
	
	@RequestMapping(value = "/saveRecharge", method = RequestMethod.POST)
	public String saveRecharge(@ModelAttribute("Recharge") Recharge recharge, ModelMap model,HttpServletRequest request)
	{
		
			
		String d=request.getAttribute("date").toString();
		recharge.setDate(d);
		System.out.println("inside recharge controller");
		System.out.println(recharge.getMobile_no()+"  "+recharge.getVender()+" "+recharge.getDate());
		
		
		List<Recharge> status=rechargeService.saveRechargeService(recharge);
		if(status==null)
		{
			model.addAttribute("invalide", "no such record found");
			return "recharge";
			
		}
		model.addAttribute("status", status);
		return "recharge";

	}

}
