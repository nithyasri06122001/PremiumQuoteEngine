package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.PremiumService;
@Service
public class PremiumServiceImpl implements PremiumService {
	@Autowired
	private PremiumRepository premiumRepository;


	@Override
	public Object findPremium(RequestData data) {
		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String paymentPlan=data.getPaymentPlan();
		String starExtraProtect=data.getStarExtraProtect();
		String policyType=data.getPolicyType();
		String optionalCover=data.getOptionalCover();
		int totalPremium=0;
	
		int optionalSumInsured=data.getOptionalSumInsured();
		
		
		
	
		
		Map<Integer, Object> object = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			PremiumQuoteEntity premium = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			PremiumQuoteEntity optionalPremiumList= new PremiumQuoteEntity();
		
			int childPremium = 0;
			int optionlPremium=0;
		
			if (productCode == 1) {
				premium = premiumRepository.findWomenCarePremium(age, adultCount, year, paymentPlan,productCode);
				if (childCount > 0) {
					childPremiumList = premiumRepository.findChildPremium(childCount, year,paymentPlan,productCode);
				}
				if(optionalCover.equalsIgnoreCase("Yes")) {
					optionalPremiumList=premiumRepository.findOptionalPremium(paymentPlan, productCode,year,age);		
			    }
			}
			
			else if(productCode == 2) {
				premium=premiumRepository.findStarComprehensivePremium(age, adultCount, year, paymentPlan, productCode,childCount);
			}
			else if (productCode == 3) {
				premium=premiumRepository.findSeniorCitizenRedCarpetPremium(adultCount,year,paymentPlan, productCode,policyType);
				
			}
			else if(productCode==4) {
				premium=premiumRepository.findStarMicroRuralAndFarmerCarePremium(age, adultCount, childCount, paymentPlan, productCode);
						year=3;
			}
			else if (productCode==5) {
				premium=premiumRepository.findStarHospitalCashInsurancePremium(productCode, age, adultCount, childCount, policyType, year, childPremium);
			}
			
			if(optionalSumInsured >0 && optionalCover.equalsIgnoreCase("Yes")) {
			switch (optionalSumInsured) {
			case 500000: {
				optionlPremium=optionalPremiumList.getLakh_5();
				break;
			}
			case 1000000: {
				optionlPremium=optionalPremiumList.getLakh_10();
				break;
			}
			case 1500000: {
				optionlPremium=optionalPremiumList.getLakh_15();
				break;
			}
			case 2000000: {
				optionlPremium=optionalPremiumList.getLakh_20();
				break;
			}
			case 2500000: {
				optionlPremium=optionalPremiumList.getLakh_25();
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + optionalSumInsured);
			}
			
			}
			
			switch (sumInsured){
			
			case 1000: {
				totalPremium= premium.getThousand_1() + childPremium;
				break;
			}
			case 2000: {
				totalPremium= premium.getThousand_2() + childPremium;
				break;
			}
			
			case 3000: {
				totalPremium= premium.getThousand_3() + childPremium;
				break;
			}
			
			case 100000: {
				totalPremium= premium.getLakh_1() + childPremium;
				break;
			}
			case 200000: {
				totalPremium= premium.getLakh_2() + childPremium;
				break;
			}
			case 300000: {
				totalPremium= premium.getLakh_3() + childPremium;
				break;
			}
			case 400000: {
				totalPremium= premium.getLakh_4() + childPremium;
				break;
			}
			case 500000: {
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_5();
				}
				totalPremium= premium.getLakh_5() + childPremium+optionlPremium;
				break;
			}
			case 750000: {
				totalPremium= premium.getLakh_7_5k() + childPremium;
				break;
			}
			case 1000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_10();
				}
				totalPremium= premium.getLakh_10() + childPremium+optionlPremium;
				break;
			}
			case 1500000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_15();
				}
				totalPremium= premium.getLakh_15() + childPremium+optionlPremium;
				break;
			}
			case 2000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_20();
				}
				totalPremium= premium.getLakh_20() + childPremium+optionlPremium;
				break;
			}
			case 2500000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_25();
				}
				totalPremium= premium.getLakh_25() + childPremium+optionlPremium;
				break;
			}
			case 5000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_50();
				}
				totalPremium= premium.getLakh_50() + childPremium+optionlPremium;
				break;
			}
			case 7500000: {
				totalPremium= premium.getLakh_75() + childPremium;
				break;
			}
			case 10000000:{
				if (productCode == 1 && childCount > 0) {
					childPremium = childPremiumList.getLakh_100();
				}
				totalPremium=  premium.getLakh_100() + childPremium+optionlPremium;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + sumInsured);
			}
			if(starExtraProtect.equalsIgnoreCase("Yes")) {
				object.put(year, Math.round(totalPremium+totalPremium*0.15));
			}
			else {
				object.put(year, totalPremium);
			}
			
		}
		return object;
	}




	
	

}