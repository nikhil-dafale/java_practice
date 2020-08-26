package java_airport;

public class Ticket1 {
	private String ticketNumer;
	private FlightInformation flightinformation;
	private PassengerInformation[] passengerinfo;

	public String getTicketNumer() {
		return ticketNumer;
	}

	public void setTicketNumer(String ticketNumer) {
		this.ticketNumer = ticketNumer;
	}

	public FlightInformation getFlightinformation() {
		return flightinformation;
	}

	public void setFlightinformation(FlightInformation flightinformation) {
		this.flightinformation = flightinformation;
	}

	public PassengerInformation[] getPassengerinfo() {
		return passengerinfo;
	}

	public void setPassengerinfo(PassengerInformation[] passengerinfo) {
		this.passengerinfo = passengerinfo;
	}

}
