package com.example.demo.entity;




import javax.validation.groups.ConvertGroup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="womenCare")
public class WomenCareEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="product_code")
    private int productCode;
    @Column(name="product_name")
    private String productName;
    @Column(name="policy_type")
    private String policyType;
    @Column(name="adult_count")
    private Integer adultCount;
    @Column(name="child_count")
	private Integer childCount;
    @Column(name="optional_cover")
	private String optionalCover;
    @Column(name="year")   
    private String year;
    @Column(name="age_band")
    private String ageBand;
    @Column(name="min_age")
    private Integer minAge;
    @Column(name="max_age")   	
    private Integer maxAge;
    @Column(name="lakh_5")    
    private Integer lakh_5;
    @Column(name="lakh_10")
    private Integer lakh_10;
    @Column(name="lakh_15") 
    private Integer lakh_15;
    @Column(name="lakh_20")
    private Integer lakh_20;
    @Column (name="lakh_25")
    private Integer lakh_25;
    @Column (name="lakh_50")
    private Integer lakh_50;
    @Column(name="lakh_100")  
    private Integer lakh_100;
    @Column(name="payment_plan")
    private String paymentPlan;
    
	public WomenCareEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public String getOptionalCover() {
		return optionalCover;
	}

	public void setOptionalCover(String optionalCover) {
		this.optionalCover = optionalCover;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAgeBand() {
		return ageBand;
	}

	public void setAgeBand(String ageBand) {
		this.ageBand = ageBand;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	public Integer getLakh_5() {
		return lakh_5;
	}

	public void setLakh_5(Integer lakh_5) {
		this.lakh_5 = lakh_5;
	}

	public Integer getLakh_10() {
		return lakh_10;
	}

	public void setLakh_10(Integer lakh_10) {
		this.lakh_10 = lakh_10;
	}

	public Integer getLakh_15() {
		return lakh_15;
	}

	public void setLakh_15(Integer lakh_15) {
		this.lakh_15 = lakh_15;
	}

	public Integer getLakh_20() {
		return lakh_20;
	}

	public void setLakh_20(Integer lakh_20) {
		this.lakh_20 = lakh_20;
	}

	public Integer getLakh_25() {
		return lakh_25;
	}

	public void setLakh_25(Integer lakh_25) {
		this.lakh_25 = lakh_25;
	}

	public Integer getLakh_50() {
		return lakh_50;
	}

	public void setLakh_50(Integer lakh_50) {
		this.lakh_50 = lakh_50;
	}

	public Integer getLakh_100() {
		return lakh_100;
	}

	public void setLakh_100(Integer lakh_100) {
		this.lakh_100 = lakh_100;
	}
	
	

	
	
}
