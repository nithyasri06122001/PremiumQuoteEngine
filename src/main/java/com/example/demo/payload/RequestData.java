package com.example.demo.payload;

import javax.validation.constraints.NotEmpty;

public class RequestData {
	
	@NotEmpty(message = "Product code should not be null or empty")
	private int productCode;
	
	private int age;
	
	private int sumInsured;
	
	private int adultCount;
	
	private int childCount;
	
	private String paymentPlan;
	
	private String starExtraProtect;
	
	private String policyType;

	private int thousand_1;
	
	private int thousand_2;
	
	private int thousand_3;
	
	private int policyDays;
	
	private String policyPlan;
	
	private String optionalCover;
	
	private int optionalSumInsured;
	
	
	public int getOptionalSumInsured() {
		return optionalSumInsured;
	}


	public void setOptionalSumInsured(int optionalSumInsured) {
		this.optionalSumInsured = optionalSumInsured;
	}


	public String getOptionalCover() {
		return optionalCover;
	}


	public void setOptionalCover(String optionalCover) {
		this.optionalCover = optionalCover;
	}


	public RequestData() {
	}


	public int getProductCode() {
		return productCode;
	}


	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSumInsured() {
		return sumInsured;
	}


	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}


	public int getAdultCount() {
		return adultCount;
	}


	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}


	public int getChildCount() {
		return childCount;
	}


	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}


	public String getPaymentPlan() {
		return paymentPlan;
	}


	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}


	public String getStarExtraProtect() {
		return starExtraProtect;
	}


	public void setStarExtraProtect(String starExtraProtect) {
		this.starExtraProtect = starExtraProtect;
	}


	public String getPolicyType() {
		return policyType;
	}


	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}


	public int getThousand_1() {
		return thousand_1;
	}


	public void setThousand_1(int thousand_1) {
		this.thousand_1 = thousand_1;
	}


	public int getThousand_2() {
		return thousand_2;
	}


	public void setThousand_2(int thousand_2) {
		this.thousand_2 = thousand_2;
	}


	public int getThousand_3() {
		return thousand_3;
	}


	public void setThousand_3(int thousand_3) {
		this.thousand_3 = thousand_3;
	}


	public int getPolicyDays() {
		return policyDays;
	}


	public void setPolicyDays(int policyDays) {
		this.policyDays = policyDays;
	}


	public String getPolicyPlan() {
		return policyPlan;
	}


	public void setPolicyPlan(String policyPlan) {
		this.policyPlan = policyPlan;
	}



	

}
