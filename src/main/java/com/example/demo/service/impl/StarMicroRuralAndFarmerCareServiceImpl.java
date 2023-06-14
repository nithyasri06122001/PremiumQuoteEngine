package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.StarMicroRuralAndFarmerCareService;
import com.example.demo.service.SumInsuredPremiumService;
@Service
public class StarMicroRuralAndFarmerCareServiceImpl implements StarMicroRuralAndFarmerCareService {
	
	@Autowired
	PremiumRepository premiumRepository;
	
	@Autowired
	SumInsuredPremiumService sumInsuredPremiumService;
	

	@Override
	public Object findStarMicroRuralAndFarmerCarePremium(RequestData data) {
		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String paymentPlan=data.getPaymentPlan();
		
		
		Map<Integer, Object> premiums = new HashMap<>();
			PremiumQuoteEntity premiumEntity = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			int optionlPremium=0;

			int premium=0;
			premiumEntity=premiumRepository.findStarMicroRuralAndFarmerCarePremium(age, adultCount, childCount, paymentPlan, productCode);
			
			premium=sumInsuredPremiumService.findSumInsuredPremium(sumInsured,premiumEntity,productCode,childCount,childPremiumList,optionlPremium);

			premiums.put(1, premium);
			
		return premiums;
	}

}
