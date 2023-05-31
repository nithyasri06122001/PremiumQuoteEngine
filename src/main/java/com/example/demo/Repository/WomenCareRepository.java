package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WomenCareEntity;
@Repository
public interface WomenCareRepository extends JpaRepository<WomenCareEntity, Integer> {
  @Query(value="select * from womenCare where :age>=min_age and :age<=max_age and adult_count=:adultCount and year=:year and payment_plan=:paymentPlan",nativeQuery=true)
  WomenCareEntity findPremium(int age,int adultCount,int year,String paymentPlan);
  
  @Query(value="select * from womenCare where child_count=:childCount and year=:year and payment_plan=:paymentPlan",nativeQuery=true)
  WomenCareEntity findChildPremium(int childCount,int year,String paymentPlan);
}
