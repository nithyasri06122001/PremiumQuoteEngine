package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.StarHospitalCashService;
import com.example.demo.service.SumInsuredPremiumService;
@Service
public class StarHospitalCashServiceImpl implements StarHospitalCashService {
	
	@Autowired
	PremiumRepository premiumRepository;
	
	@Autowired
	SumInsuredPremiumService sumInsuredPremiumService;

	@Override
	public Object findStarHospitalCashPremium(RequestData data) {
		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String policyType=data.getPolicyType();
		String policyPlan=data.getPolicyPlan();
		int policyDays=data.getPolicyDays();
		
		Map<Integer, Object> premiums = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			PremiumQuoteEntity premiumEntity = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			int optionlPremium=0;

			int premium=0;
			premiumEntity=premiumRepository.findStarHospitalCashInsurancePremium(productCode,age,adultCount,childCount, policyPlan, year, policyDays);
			
			premium=sumInsuredPremiumService.findSumInsuredPremium(sumInsured,premiumEntity,productCode,childCount,childPremiumList,optionlPremium);
			
			premiums.put(year, premium);
		}	
		return premiums;
	}
	

}
