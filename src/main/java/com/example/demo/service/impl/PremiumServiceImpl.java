package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.payload.RequestData;
import com.example.demo.service.PremiumService;
import com.example.demo.service.SeniorCitizenRedCarpetService;
import com.example.demo.service.StarComprehensiveService;
import com.example.demo.service.StarHospitalCashService;
import com.example.demo.service.StarMicroRuralAndFarmerCareService;
import com.example.demo.service.WomenCareService;

@Service("")
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	WomenCareService womenCareService;

	@Autowired
	StarComprehensiveService starComprehensiveService;

	@Autowired
	StarMicroRuralAndFarmerCareService starMicroRuralAndFarmerCareService;

	@Autowired
	SeniorCitizenRedCarpetService seniorCitizenRedCarpetService;

	@Autowired
	StarHospitalCashService starHospitalCashService;

	@Override
	public Object findPremium(RequestData data) {
		int productCode = data.getProductCode();
		
		Map<String, Object> object = new HashMap<>();

		if (productCode == 1) {
			return womenCareService.findWomenCarePremium(data);
		}

		else if (productCode == 2) {
			return starComprehensiveService.findStarComprehensivePremium(data);
		} else if (productCode == 3) {
			return seniorCitizenRedCarpetService.findSeniorCitizenRedCarpetPremium(data);
		} else if (productCode == 4) {
			return starMicroRuralAndFarmerCareService.findStarMicroRuralAndFarmerCarePremium(data);

		} else if (productCode == 5) {
			return starHospitalCashService.findStarHospitalCashPremium(data);
		} else {
			object.put("message", "not found");
			return object;
		}

	}

}