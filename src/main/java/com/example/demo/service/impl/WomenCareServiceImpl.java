package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.WomenCareRepository;
import com.example.demo.entity.WomenCareEntity;
import com.example.demo.payload.Data;
import com.example.demo.service.WomenCareService;
@Service
public class WomenCareServiceImpl implements WomenCareService {
	@Autowired
	private WomenCareRepository womenCareRepository;

	@Override
	public List<WomenCareEntity> findAll() {
		return womenCareRepository.findAll();
	}

	@Override
	public Object findPremium(Data data) {
		int productCode=data.getProductCode();
		int age=data.getAge();
		int adultCount=data.getAdultCount();
		int childCount=data.getChildCount();
		int sumInsured=data.getSumInsured();
		String paymentPlan=data.getPaymentPlan();
		
		Map<Integer, Object> object = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			WomenCareEntity premium = new WomenCareEntity();
			WomenCareEntity childPremiumList = new WomenCareEntity();
			int childPremium = 0;
			if (productCode == 1) {
				premium = womenCareRepository.findPremium(age, adultCount, year, paymentPlan);
				if (childCount > 0) {
					childPremiumList = womenCareRepository.findChildPremium(childCount, year,paymentPlan);
					childPremium = childPremiumList.getLakh_5();
				}
			}
			
			switch (sumInsured){
			case 500000: {
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_5();
				}
				object.put(year, premium.getLakh_5() + childPremium);
				break;
			}
			case 1000000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_10();
				}
				object.put(year, premium.getLakh_10() + childPremium);
				break;
			}
			case 1500000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_15();
				}
				object.put(year, premium.getLakh_15() + childPremium);
				break;
			}
			case 2000000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_20();
				}
				object.put(year, premium.getLakh_20() + childPremium);
				break;
			}
			case 2500000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_25();
				}
				object.put(year, premium.getLakh_25() + childPremium);
				break;
			}
			case 5000000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_50();
				}
				object.put(year, premium.getLakh_50() + childPremium);
				break;
			}
			case 10000000:{
				if (childCount > 0) {
					childPremium = childPremiumList.getLakh_100();
				}
				object.put(year, premium.getLakh_100() + childPremium);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + sumInsured);
			}
		}
		return object;
	}




	
	

}
