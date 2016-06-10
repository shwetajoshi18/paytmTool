package com.aartek.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Recharge;






@Repository
public class RechargeRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<Recharge> showRechargeRepo(Recharge recharge)
	{
		System.out.println("inside repository");
		ArrayList<Recharge> recharg = new ArrayList<Recharge>();
		recharg=null;
		recharg = (ArrayList<Recharge>) hibernateTemplate.loadAll(Recharge.class);
		System.out.println("after getting data ");
		for (Recharge recharge2 : recharg) {
			System.out.println(recharge2.getId()+" "+recharge2.getMobile_no()+" "+recharge2.getAmount()+" "+recharge2.getVender());
		}
		return recharg;
		
	}
	
	public List<Recharge> saveRechargeRepo(Recharge recharge)
	{
		System.out.println("inside repository");
		System.out.println(recharge.getVender()+"  "+recharge.getAmount());	
		ArrayList<Recharge> recharg = new ArrayList<Recharge>();
		recharg=null;
		hibernateTemplate.save(recharge);
		
		recharg = (ArrayList<Recharge>) hibernateTemplate.loadAll(Recharge.class);
		System.out.println("after getting data ");
		for (Recharge recharge2 : recharg) {
			System.out.println(recharge2.getId()+" "+recharge2.getMobile_no()+" "+recharge2.getAmount()+" "+recharge2.getVender());
		}
		return recharg;
		
	}
}
