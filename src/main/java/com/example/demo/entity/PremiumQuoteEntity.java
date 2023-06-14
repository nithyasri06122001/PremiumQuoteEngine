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
    private Integer oneLakh;
    @Column(name="lakh_2")    
    private Integer twoLakh;
    @Column(name="lakh_3")    
    private Integer threeLakh;
    @Column(name="lakh_4")    
    private Integer fourLakh;
    @Column(name="lakh_5")    
    private Integer fiveLakh;
    @Column(name = "lakh_7_5k")
    private Integer sevenLakhFiveThousand;
    @Column(name="lakh_10")
    private Integer tenLakh;
    @Column(name="lakh_15") 
    private Integer fifteenLakh;
	@Column(name="lakh_20")
    private Integer twentyLakh;
    @Column (name="lakh_25")
    private Integer twentyFiveLakh;
    @Column (name="lakh_50")
    private Integer fiftyLakh;
    @Column (name = "lakh_75")
    private Integer seventyFiveLakh;
    @Column(name="lakh_100")  
    private Integer oneCrore;
    @Column(name="payment_plan")
    private String paymentPlan;
    @Column(name = "thousand_1")
    private Integer oneThousand;
    @Column(name = "thousand_2")
    private Integer twoThousand;
    @Column(name = "thousand_3")
    private Integer threeThousand;
    @Column(name="policy_days")
    private Integer policyDays;
    @Column(name = "policy_plan")
    private String policyPlan;
    
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
	public Integer getOneLakh() {
		return oneLakh;
	}
	public void setOneLakh(Integer oneLakh) {
		this.oneLakh = oneLakh;
	}
	public Integer getTwoLakh() {
		return twoLakh;
	}
	public void setTwoLakh(Integer twoLakh) {
		this.twoLakh = twoLakh;
	}
	public Integer getThreeLakh() {
		return threeLakh;
	}
	public void setThreeLakh(Integer threeLakh) {
		this.threeLakh = threeLakh;
	}
	public Integer getFourLakh() {
		return fourLakh;
	}
	public void setFourLakh(Integer fourLakh) {
		this.fourLakh = fourLakh;
	}
	public Integer getFiveLakh() {
		return fiveLakh;
	}
	public void setFiveLakh(Integer fiveLakh) {
		this.fiveLakh = fiveLakh;
	}
	public Integer getSevenLakhFiveThousand() {
		return sevenLakhFiveThousand;
	}
	public void setSevenLakhFiveThousand(Integer sevenLakhFiveThousand) {
		this.sevenLakhFiveThousand = sevenLakhFiveThousand;
	}
	public Integer getTenLakh() {
		return tenLakh;
	}
	public void setTenLakh(Integer tenLakh) {
		this.tenLakh = tenLakh;
	}
	public Integer getFifteenLakh() {
		return fifteenLakh;
	}
	public void setFifteenLakh(Integer fifteenLakh) {
		this.fifteenLakh = fifteenLakh;
	}
	public Integer getTwentyLakh() {
		return twentyLakh;
	}
	public void setTwentyLakh(Integer twentyLakh) {
		this.twentyLakh = twentyLakh;
	}
	public Integer getTwentyFiveLakh() {
		return twentyFiveLakh;
	}
	public void setTwentyFiveLakh(Integer twentyFiveLakh) {
		this.twentyFiveLakh = twentyFiveLakh;
	}
	public Integer getFiftyLakh() {
		return fiftyLakh;
	}
	public void setFiftyLakh(Integer fiftyLakh) {
		this.fiftyLakh = fiftyLakh;
	}
	public Integer getSeventyFiveLakh() {
		return seventyFiveLakh;
	}
	public void setSeventyFiveLakh(Integer seventyFiveLakh) {
		this.seventyFiveLakh = seventyFiveLakh;
	}
	public Integer getOneCrore() {
		return oneCrore;
	}
	public void setOneCrore(Integer oneCrore) {
		this.oneCrore = oneCrore;
	}
	public String getPaymentPlan() {
		return paymentPlan;
	}
	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
	public Integer getOneThousand() {
		return oneThousand;
	}
	public void setOneThousand(Integer oneThousand) {
		this.oneThousand = oneThousand;
	}
	public Integer getTwoThousand() {
		return twoThousand;
	}
	public void setTwoThousand(Integer twoThousand) {
		this.twoThousand = twoThousand;
	}
	public Integer getThreeThousand() {
		return threeThousand;
	}
	public void setThreeThousand(Integer threeThousand) {
		this.threeThousand = threeThousand;
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
