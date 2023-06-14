package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.PremiumQuoteEntity;
@Service
public interface SumInsuredPremiumService {
	
	int findSumInsuredPremium(int sumInsured,PremiumQuoteEntity premiumEntity,int productCode,int childCount,PremiumQuoteEntity childPremiumList,int optionlPremium);
	
	int findOptionalSumInsuredPremium(int productCode,int optionalSumInsured,String optionalCover,PremiumQuoteEntity optionalPremiumList);

}
