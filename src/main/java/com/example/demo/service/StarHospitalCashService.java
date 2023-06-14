package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.payload.RequestData;
@Service
public interface StarHospitalCashService {
Object findStarHospitalCashPremium(RequestData data);
}
