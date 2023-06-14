package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.StarComprehensiveService;
import com.example.demo.service.SumInsuredPremiumService;
@Service
public class StarComprenensiveServiceImpl implements StarComprehensiveService {
	
	@Autowired
	private PremiumRepository premiumRepository;
	
	@Autowired
	SumInsuredPremiumService sumInsuredPremiumService;

	@Override
	public Object findStarComprehensivePremium(RequestData data) {
		
		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String paymentPlan=data.getPaymentPlan();
		String starExtraProtect=data.getStarExtraProtect();
		
		
		Map<Integer, Object> premiums = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			PremiumQuoteEntity premiumEntity = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			int optionlPremium=0;
			int premium=0;
			premiumEntity=premiumRepository.findStarComprehensivePremium( age,  adultCount,  year,  paymentPlan,  productCode,
					 childCount);
			
			premium=sumInsuredPremiumService.findSumInsuredPremium(sumInsured,premiumEntity,productCode,childCount,childPremiumList,optionlPremium);
			
			if(starExtraProtect.equalsIgnoreCase("Yes")) {
				premiums.put(year, Math.round(premium+premium*0.15));
			}
			else {
				premiums.put(year, premium);
			}
		}	
		return premiums;
	}

}
