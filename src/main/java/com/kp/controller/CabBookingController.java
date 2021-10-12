package com.kp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kp.request.binding.Cab;
import com.kp.response.binding.CabBookingConfirmation;
import com.kp.service.CabBookingService;

@RestController
@RequestMapping("/cab")
public class CabBookingController {
	@Autowired
	CabBookingService cabService ;
	
	
	@PostMapping(value="/book",
			produces={"application/xml", "application/json"},
			consumes={"application/xml", "application/json"}
	)
	public ResponseEntity<CabBookingConfirmation> bookACab(@RequestBody Cab cab){
		System.out.println("Cab Data:" + cab);
		String availability = cab.getAvailability();
		CabBookingConfirmation booking = new CabBookingConfirmation();
		if(availability.equals("available")) {
			Double fare = cabService.calculateFare(cab.getDistanceInKM());
			booking.setCabID(cab.getCabID());
			booking.setDeparturePlace(cab.getDeparturePlace());
			booking.setDestinationPlace(cab.getDestinationPlace());
			booking.setFare(fare);
			booking.setBookingStatus("Cab booked Successfully");
		}
		else {
			System.out.println("Cab is not available");
		}		
		return new ResponseEntity<CabBookingConfirmation>(booking, HttpStatus.OK);
	}

}
