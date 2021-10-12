package com.kp.service;

import org.springframework.stereotype.Service;

@Service
public class CabBookingService {
	
	public Double calculateFare(Double distanceInKm) {
		Double farePerKm = 10.00;
		Double totalFare = distanceInKm * farePerKm;
//		System.out.println(totalFare);
		return totalFare;
	}

}
