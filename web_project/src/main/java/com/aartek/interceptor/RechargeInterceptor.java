package com.aartek.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class RechargeInterceptor extends HandlerInterceptorAdapter  {
	
	
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
	System.out.println("inside pre");

	
	String d= request.getParameter("date");
	
	int date1,month1,year1,date2;
	System.out.println(d);
	String[] d1=d.split("/");
	date1=Integer.parseInt(d1[0]);
	month1=Integer.parseInt(d1[1]);
	year1=Integer.parseInt(d1[2]);
	
	date2=year1;
	year1=date1;
	date1=date2;
 String date=String.valueOf(date2);
 String year=String.valueOf(year1);
 String month=String.valueOf(month1);
 
 String d2=date.concat("/");
 String d3=d2.concat(month);
 String d4=d3.concat("/");
 String d5=d4.concat(year);
 request.setAttribute("date", d5);
 System.out.println(d5);
 
			return true;
		
		}
		

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("inside post handler");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("inside after complition");

	}

}
