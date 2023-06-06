package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="premiumquote")
public class PremiumQuoteEntity {
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
    
    @Column(name="lakh_1")    
    private Integer lakh_1;
    @Column(name="lakh_2")    
    private Integer lakh_2;
    @Column(name="lakh_3")    
    private Integer lakh_3;
    @Column(name="lakh_4")    
    private Integer lakh_4;
    @Column(name="lakh_5")    
    private Integer lakh_5;
    @Column(name = "lakh_7_5k")
    private Integer lakh_7_5k;
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
    @Column (name = "lakh_75")
    private Integer lakh_75;
    @Column(name="lakh_100")  
    private Integer lakh_100;
    @Column(name="payment_plan")
    private String paymentPlan;
    @Column(name = "thousand_1")
    private Integer thousand_1;
    @Column(name = "thousand_2")
    private Integer thousand_2;
    @Column(name = "thousand_3")
    private Integer thousand_3;
    @Column(name="policy_days")
    private Integer policyDays;
    @Column(name = "policy_plan")
    private String policyPlan;
    
	

	public PremiumQuoteEntity() {
		super();
		
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

	public Integer getLakh_1() {
		return lakh_1;
	}

	public void setLakh_1(Integer lakh_1) {
		this.lakh_1 = lakh_1;
	}

	public Integer getLakh_2() {
		return lakh_2;
	}

	public void setLakh_2(Integer lakh_2) {
		this.lakh_2 = lakh_2;
	}

	public Integer getLakh_3() {
		return lakh_3;
	}

	public void setLakh_3(Integer lakh_3) {
		this.lakh_3 = lakh_3;
	}

	public Integer getLakh_4() {
		return lakh_4;
	}

	public void setLakh_4(Integer lakh_4) {
		this.lakh_4 = lakh_4;
	}

	public Integer getLakh_5() {
		return lakh_5;
	}

	public void setLakh_5(Integer lakh_5) {
		this.lakh_5 = lakh_5;
	}

	public Integer getLakh_7_5k() {
		return lakh_7_5k;
	}

	public void setLakh_7_5k(Integer lakh_7_5k) {
		this.lakh_7_5k = lakh_7_5k;
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

	public Integer getLakh_75() {
		return lakh_75;
	}

	public void setLakh_75(Integer lakh_75) {
		this.lakh_75 = lakh_75;
	}

	public Integer getLakh_100() {
		return lakh_100;
	}

	public void setLakh_100(Integer lakh_100) {
		this.lakh_100 = lakh_100;
	}

	public String getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public Integer getThousand_1() {
		return thousand_1;
	}

	public void setThousand_1(Integer thousand_1) {
		this.thousand_1 = thousand_1;
	}

	public Integer getThousand_2() {
		return thousand_2;
	}

	public void setThousand_2(Integer thousand_2) {
		this.thousand_2 = thousand_2;
	}

	public Integer getThousand_3() {
		return thousand_3;
	}

	public void setThousand_3(Integer thousand_3) {
		this.thousand_3 = thousand_3;
	}

	public Integer getPolicyDays() {
		return policyDays;
	}

	public void setPolicyDays(Integer policyDays) {
		this.policyDays = policyDays;
	}

	public String getPolicyPlan() {
		return policyPlan;
	}

	public void setPolicyPlan(String policyPlan) {
		this.policyPlan = policyPlan;
	}	
	
}
