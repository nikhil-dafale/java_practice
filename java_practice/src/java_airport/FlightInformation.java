package java_airport;

import java.util.Date;

public class FlightInformation {
	private int flightNumber;
	private Date travelDate;
	private String travelClass;
	private String seatNumber;
	private long bookingNumber;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Date getType() {
		return travelDate;
	}

	public void setType(Date type) {
		this.travelDate = type;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public long getBookingNuber() {
		return bookingNumber;
	}

	public void setBookingNuber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

}
