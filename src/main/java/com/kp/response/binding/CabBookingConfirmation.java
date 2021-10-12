package com.kp.response.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class CabBookingConfirmation {
	
	private String cabID;
	private String departurePlace;
	private String destinationPlace;
	private Double fare;
	private String bookingStatus;

}
