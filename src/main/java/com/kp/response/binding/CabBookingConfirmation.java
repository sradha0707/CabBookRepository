package com.kp.response.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CabBookingConfirmation {
	
	private String cabID;
	private String departurePlace;
	private String destinationPlace;
	private Double fare;
	private String bookingStatus;
	
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
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "CabBookingService [cabID=" + cabID + ", departurePlace=" + departurePlace + ", destinationPlace="
				+ destinationPlace + ", fare=" + fare + ", bookingStatus=" + bookingStatus + "]";
	}
	
	

}
