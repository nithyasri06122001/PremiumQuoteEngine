package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.PremiumQuoteEntity;
import com.example.demo.service.SumInsuredPremiumService;
@Service
public class SumInsuredPremiumServiceImpl implements SumInsuredPremiumService {

	@Override
	public int findSumInsuredPremium(int sumInsured, PremiumQuoteEntity premiumEntity, int productCode, int childCount,
			PremiumQuoteEntity childPremiumList, int optionlPremium) {
		   int totalPremium=0;
		   int childPremium=0;
		   
	   
	   switch (sumInsured){
		
		case 1000: {
			totalPremium= premiumEntity.getOneThousand();
			break;
		}
		case 2000: {
			totalPremium= premiumEntity.getTwoThousand();
			break;
		}
		
		case 3000: {
			totalPremium= premiumEntity.getThreeThousand();
			break;
		}
		
		case 100000: {
			totalPremium= premiumEntity.getOneLakh();
			break;
		}
		case 200000: {
			totalPremium= premiumEntity.getTwoLakh();
			break;
		}
		case 300000: {
			totalPremium= premiumEntity.getThreeLakh();
			break;
		}
		case 400000: {
			totalPremium= premiumEntity.getFourLakh();
			break;
		}
		case 500000: {
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getFiveLakh();
			}
			totalPremium= premiumEntity.getFiveLakh() + childPremium+optionlPremium;
			break;
		}
		case 750000: {
			totalPremium= premiumEntity.getSevenLakhFiveThousand();
			break;
		}
		case 1000000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getTenLakh();
			}
			totalPremium= premiumEntity.getTenLakh() + childPremium+optionlPremium;
			break;
		}
		case 1500000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getFifteenLakh();
			}
			totalPremium= premiumEntity.getFifteenLakh() + childPremium+optionlPremium;
			break;
		}
		case 2000000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getTwentyLakh();
			}
			totalPremium= premiumEntity.getTwentyLakh() + childPremium+optionlPremium;
			break;
		}
		case 2500000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getTwentyFiveLakh();
			}
			totalPremium= premiumEntity.getTwentyFiveLakh() + childPremium+optionlPremium;
			break;
		}
		case 5000000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getFiftyLakh();
			}
			totalPremium= premiumEntity.getFiftyLakh() + childPremium+optionlPremium;
			break;
		}
		case 7500000: {
			totalPremium= premiumEntity.getSeventyFiveLakh();
			break;
		}
		case 10000000:{
			if (productCode == 1 && childCount > 0) {
				childPremium = childPremiumList.getOneCrore();
			}
			totalPremium=  premiumEntity.getOneCrore() + childPremium+optionlPremium;
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + sumInsured);
		}
	   
	   return totalPremium;

	}

	@Override
	public int findOptionalSumInsuredPremium(int productCode, int optionalSumInsured, String optionalCover,
			PremiumQuoteEntity optionalPremiumList) {
		 int optionlPremium=0;
			if(productCode==1 && optionalSumInsured >0 && optionalCover.equalsIgnoreCase("Yes")) {
				switch (optionalSumInsured) {
				case 500000: {
					optionlPremium=optionalPremiumList.getFiveLakh();
					break;
				}
				case 1000000: {
					optionlPremium=optionalPremiumList.getTenLakh();
					break;
				}
				case 1500000: {
					optionlPremium=optionalPremiumList.getFifteenLakh();
					break;
				}
				case 2000000: {
					optionlPremium=optionalPremiumList.getTwentyLakh();
					break;
				}
				case 2500000: {
					optionlPremium=optionalPremiumList.getTwentyFiveLakh();
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + optionalSumInsured);
				}
				
				}
		   return optionlPremium;
	}

}
