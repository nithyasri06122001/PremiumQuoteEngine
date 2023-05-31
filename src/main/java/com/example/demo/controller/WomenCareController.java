package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WomenCareEntity;
import com.example.demo.payload.Data;
import com.example.demo.service.WomenCareService;

@RestController
public class WomenCareController {
	@Autowired
	private WomenCareService womenCareService;

	@GetMapping("/find")
	public List<WomenCareEntity> find() {
		return womenCareService.findAll();
	}
	

	
	@GetMapping(path = "/premium", produces = "application/json")
	public Object findPremium(@RequestBody Data data) {
		return womenCareService.findPremium(data);

	}
}
