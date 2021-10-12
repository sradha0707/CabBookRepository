package com.kp.service;

import org.springframework.stereotype.Service;

import com.kp.request.binding.Cab;
import com.kp.response.binding.CabBookingConfirmation;

@Service
public class CabBookingService {

	CabBookingConfirmation cabBookingConfirmation ;
	
	
	public CabBookingConfirmation setResponseData(Cab cab) {
		Double fare = calculateFare(cab.getDistanceInKM());
		
		cabBookingConfirmation = new CabBookingConfirmation();
		
		cabBookingConfirmation.setCabID(cab.getCabID());
		cabBookingConfirmation.setDeparturePlace(cab.getDeparturePlace());
		cabBookingConfirmation.setDestinationPlace(cab.getDestinationPlace());
		cabBookingConfirmation.setFare(fare);
		cabBookingConfirmation.setBookingStatus("Cab booked Successfully");
		
		 return cabBookingConfirmation;
	}
	
	public static Double calculateFare(Double distanceInKm) {
		Double farePerKm = 10.00;
		return distanceInKm * farePerKm;
	}

}
