package java_railway;

import java.util.Date;

public class Train {

	private int trainNumber;
	private String trainName;
	private Date arrival;
	private Date departure;

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ",trainName=" + trainName + ", arrival=" + arrival + ", departure=" + departure + "]";
	}
}
