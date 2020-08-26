package java_airport;

import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		
		//Creating tikcet1 object
		Ticket1 ticket1= new Ticket1();
		ticket1.setTicketNumer("D2N3372020");
		
		//Creating FlightInformation for ticket1
		FlightInformation flight=new FlightInformation();
		flight.setBookingNuber(789654l);
		flight.setFlightNumber(2247);
		flight.setSeatNumber("21-d");
		flight.setTravelClass("Economy");
		//flight.setType(new Date("21-06-2021"));
		
		//setting flight information with ticket1
		ticket1.setFlightinformation(flight);
		
		
		//Creating passengerInf[] array
		PassengerInformation[] passenger=new PassengerInformation[2];
		
		//creating array object
		PassengerInformation passenger1=new PassengerInformation();
		passenger1.setName("Nikhil");
		passenger1.setAddress("426-post wardha");
		passenger1.setFlightInformation(flight);
		passenger1.setAge(32);
		
		passenger[0]=passenger1;
		
		ticket1.setPassengerinfo(passenger);
		
		
 
	}

}
