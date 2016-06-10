package com.aartek.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aartek.service.DisplayService;



@Controller
public class DisplayController {

@Autowired
private DisplayService displayService;
	
	@RequestMapping("/Display")
	public String showDisplay(HttpServletRequest request)
	{
		Object[] dt=null;
		System.out.println("inside view page");
		
		List<Object> status=displayService.showDisplayService();
		if(status==null)
		{
			return "welcome";
			}
		
		Iterator<Object> it = status.iterator();
		while (it.hasNext()) {
			 dt = (Object[]) it.next();
			System.out.println(dt[0]);
			
		}
		request.setAttribute("display", dt);
		return "display";
		
		
	}
	
	
}
