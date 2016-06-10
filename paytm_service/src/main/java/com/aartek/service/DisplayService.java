package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.repository.DisplayRepository;

@Service
public class DisplayService {

	@Autowired
	private DisplayRepository displayRepository;
	
	
	
	public List<Object> showDisplayService()
	{
		
			List<Object> list = null;
			 list = displayRepository.showDisplayRepo();
			 
			 
				return list;
			}
	
	
}
