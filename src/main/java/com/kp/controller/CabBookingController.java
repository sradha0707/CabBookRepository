package com.kp.controller;

import java.util.logging.Logger;

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
	
    public static final Logger logger = Logger.getLogger(CabBookingController.class.getName(), null);
    		
	@PostMapping(value="/book",
			produces={"application/xml", "application/json"},
			consumes={"application/xml", "application/json"}
	)
	public ResponseEntity<CabBookingConfirmation> bookACab(@RequestBody Cab cab){
		final String availability = cab.getAvailability();	
		CabBookingConfirmation booking = null;
		if(availability.equals("available")) {
			booking = cabService.setResponseData(cab);
			logger.info("Cab booked Successfully");
		}
		else {
			logger.info("Not added Cab is not available");
		}		
		return new ResponseEntity<>(booking, HttpStatus.OK);
	}

}
