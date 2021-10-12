package com.kp.request.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cab {
	
	private String cabID;
	private String departurePlace;
	private String destinationPlace;
	private Double distanceInKM;
	private String availability;
	
	public String getCabID() {
		return cabID;
	}
	public void setCabID(String cabID) {
		this.cabID = cabID;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}

	public Double getDistanceInKM() {
		return distanceInKM;
	}
	public void setDistanceInKM(Double distanceInKM) {
		this.distanceInKM = distanceInKM;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Cab [cabID=" + cabID + ", departurePlace=" + departurePlace + ", destinationPlace=" + destinationPlace
				+ ", distanceInKM=" + distanceInKM + ", availability=" + availability + "]";
	}
	
}
