package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Recharge;
import com.aartek.repository.RechargeRepository;

@Service
public class RechargeService {

	@Autowired RechargeRepository rechargeRepo;
	
	public List<Recharge> showRechargeService(Recharge recharge)
	{
		System.out.println("Inside Service Method" +recharge.getAmount()+" "+recharge.getVender());
		
		Recharge userMember = (Recharge) recharge;
			List<Recharge> list = null;
			 list = rechargeRepo.showRechargeRepo(recharge);
			 
			 if (list.size() == 0) {
				userMember = null;
				return null;
			} else {
				userMember = (Recharge) list.get(0);
				return list;
			}
	}
	
	public List<Recharge> saveRechargeService(Recharge recharge)
	{
		System.out.println("Inside Service Method" +recharge.getAmount()+" "+recharge.getVender());
		
		Recharge userMember = (Recharge) recharge;
			List<Recharge> list = null;
			 list = rechargeRepo.saveRechargeRepo(recharge);
			 
			 if (list.size() == 0) {
				userMember = null;
				return null;
			} else {
				userMember = (Recharge) list.get(0);
				return list;
			}
	}
	
}
