package java_railway;

import java.util.Date;

public class Booking {
	private int bookingId;
	private int pnr;
	private Date bookedOn;
	private Date cancelledOn;
	private BookingStatus status;
	private Passenger passenger;
	private Train train;
	private Coach coach;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Date getBookedOn() {
		return bookedOn;
	}
	public void setBookedOn(Date bookedOn) {
		this.bookedOn = bookedOn;
	}
	public Date getCancelledOn() {
		return cancelledOn;
	}
	public void setCancelledOn(Date cancelledOn) {
		this.cancelledOn = cancelledOn;
	}
	public BookingStatus getStatus() {
		return status;
	}
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", pnr=" + pnr + ", bookedOn=" + bookedOn + ", cancelledOn="
				+ cancelledOn + ", status=" + status + ", passenger=" + passenger + ", train=" + train + ", coach="
				+ coach + "]";
	}
	
	 	
}
