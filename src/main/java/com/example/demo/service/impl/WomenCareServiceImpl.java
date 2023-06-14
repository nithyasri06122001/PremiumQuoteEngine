package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.SumInsuredPremiumService;
import com.example.demo.service.WomenCareService;


@Service
public class WomenCareServiceImpl implements WomenCareService {
	
	@Autowired
	private PremiumRepository premiumRepository;
	
	@Autowired
	SumInsuredPremiumService sumInsuredPremiumService;

	@Override
	public Object findWomenCarePremium(RequestData data) {
		

		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String paymentPlan=data.getPaymentPlan();
		String optionalCover=data.getOptionalCover();
		int optionalSumInsured=data.getOptionalSumInsured();
		
		Map<Integer, Object> premiums = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			PremiumQuoteEntity premiumEntity = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			PremiumQuoteEntity optionalPremiumList= new PremiumQuoteEntity();
			int optionlPremium=0;
			int premium=0;
			
				premiumEntity = premiumRepository.findWomenCarePremium(age, adultCount, year, paymentPlan,productCode);
				if (childCount > 0) {
					childPremiumList = premiumRepository.findChildPremium(childCount, year,paymentPlan,productCode);
				}
				if(optionalCover.equalsIgnoreCase("Yes")) {
					optionalPremiumList=premiumRepository.findOptionalPremium(paymentPlan, productCode,year,age);		
			    }
			
			if(optionalCover.equalsIgnoreCase("Yes")) {
			optionlPremium= sumInsuredPremiumService.findOptionalSumInsuredPremium(productCode,optionalSumInsured,optionalCover,optionalPremiumList);
			}
			
			premium=sumInsuredPremiumService.findSumInsuredPremium(sumInsured,premiumEntity,productCode,childCount,childPremiumList,optionlPremium);
			
			
				premiums.put(year, premium);
			
		}	
		return premiums;
	}

}
