package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PremiumQuoteEntity;

@Repository
public interface PremiumRepository extends JpaRepository<PremiumQuoteEntity, Integer> {
	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
	PremiumQuoteEntity findWomenCarePremium(int age, int adultCount, int year, String paymentPlan, int productCode);

	@Query(value = "select * from premiumquote where child_count=:childCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
	PremiumQuoteEntity findChildPremium(int childCount, int year, String paymentPlan,int productCode);
	
	@Query(value="select * from premiumquote where optional_cover='Yes' and payment_plan=:paymentPlan and product_code=:productCode and year=:year  and :age>=min_age and :age<=max_age" ,nativeQuery=true)
	PremiumQuoteEntity findOptionalPremium(String paymentPlan,int productCode,int year,int age);

	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan and product_code=:productCode and child_count=:childCount", nativeQuery = true)
	PremiumQuoteEntity findStarComprehensivePremium(int age, int adultCount, int year, String paymentPlan, int productCode,
			int childCount);

	@Query(value = "select * from premiumquote where product_code=:productCode and policy_type=:policyType and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan ", nativeQuery = true)
	PremiumQuoteEntity findSeniorCitizenRedCarpetPremium(int adultCount, int year, String paymentPlan, int productCode,
			String policyType);

	@Query(value = "select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and child_count=:childCount and payment_plan=:paymentPlan and product_code=:productCode", nativeQuery = true)
	PremiumQuoteEntity findStarMicroRuralAndFarmerCarePremium(int age, int adultCount, int childCount, String paymentPlan,
			int productCode);
	@Query(value="select * from premiumquote where :age>=min_age and :age<=max_age and adult_count=:adultCount and child_count=:childCount and policy_plan=:policyPlan and policy_days=:policyDays and product_code=:productCode and year=:year", nativeQuery = true)
	PremiumQuoteEntity findStarHospitalCashInsurancePremium(int productCode,int age,int adultCount,int childCount,String policyPlan,int year,int policyDays);
}