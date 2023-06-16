package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PremiumRepository;
import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.payload.RequestData;
import com.example.demo.service.SeniorCitizenRedCarpetService;
import com.example.demo.service.SumInsuredPremiumService;

@Service("Senior Citizen's Red Carpet")
@Primary
public class SeniorCitizenRedCarpetServiceImpl implements SeniorCitizenRedCarpetService {

	@Autowired
	PremiumRepository premiumRepository;

	@Autowired
	SumInsuredPremiumService sumInsuredPremiumService;

	@Override

	public Object findPremium(RequestData data) {
		int productCode = data.getProductCode();
		int adultCount = data.getAdultCount();
		int childCount = data.getChildCount();
		int sumInsured = data.getSumInsured();
		String paymentPlan = data.getPaymentPlan();
		String policyType = data.getPolicyType();

		Map<Integer, Object> premiums = new HashMap<>();
		for (int year = 1; year <= 3; year++) {
			PremiumQuoteEntity premiumEntity = new PremiumQuoteEntity();
			PremiumQuoteEntity childPremiumList = new PremiumQuoteEntity();
			int optionlPremium = 0;

			int premium = 0;
			premiumEntity = premiumRepository.findSeniorCitizenRedCarpetPremium(adultCount, year, paymentPlan,
					productCode, policyType);

			premium = sumInsuredPremiumService.findSumInsuredPremium(sumInsured, premiumEntity, productCode, childCount,
					childPremiumList, optionlPremium);

			premiums.put(year, premium);

		}
		return premiums;
	}

}
