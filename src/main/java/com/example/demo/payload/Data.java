package com.example.demo.payload;

public class Data {
	
	private int productCode;
	
	private int age;
	
	private int sumInsured;
	
	private int adultCount;
	
	private int childCount;
	
	private String paymentPlan;

	public Data() {
	}

	public Data(int productCode, int age, int sumInsured, int adultCount, int childCount,String paymentPlan) {
		super();
		this.productCode = productCode;
		this.age = age;
		this.sumInsured = sumInsured;
		this.adultCount = adultCount;
		this.childCount = childCount;
		this.paymentPlan=paymentPlan;
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

	public void getPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
	
	
	
	

}
