package java_railway;

import java.util.Date;

public class Passenger {
	private int id;
	private String name;
	private int age;
	private char gender;
	private int seatNo;
	private BookingStatus bookingStatus;
	private  Date bookedOn;
	private  Date cancelledOn;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", seatNo=" + seatNo
				+ ", bookingStatus=" + bookingStatus + ", bookedOn=" + bookedOn + ", cancelledOn=" + cancelledOn
				+ ", address=" + address + "]";
	}


}
