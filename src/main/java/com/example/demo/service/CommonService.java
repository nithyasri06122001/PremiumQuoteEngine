package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.demo.payload.RequestData;

@Service
public class CommonService {
	
	@Autowired
	ApplicationContext context;
	
	public Object findPremium(RequestData data) {
		String productName=data.getProductName();
		
		PremiumService premiumService = context.getBean(productName, PremiumService.class);
		return premiumService.findPremium(data);
	} 

}
