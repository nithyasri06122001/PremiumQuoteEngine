package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.WomenCareEntity;
import com.example.demo.payload.Data;
@Service
public interface WomenCareService {

	List<WomenCareEntity> findAll();
	
	Object findPremium(Data data);
	
}
