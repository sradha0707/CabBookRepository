package com.kp.request.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Cab {
	
	private String cabID;
	private String departurePlace;
	private String destinationPlace;
	private Double distanceInKM;
	private String availability;
	
	
}
