package java_railway;

import java.util.Date;
import java.util.Scanner;

public abstract class BookingUtility {

	private static Scanner scan= new Scanner(System.in);
	
	
//----NEW BOOKING
	public static void startNewBooking(Booking[] bookings, int nextBookingIndex)

	{
		System.out.println("------TRAINS AVAILABLE------");
		//creating train records(no. of train objects)	
		Train[] trains = RecordUtility.getTrains();
		
		for(Train train: trains) {
			System.out.println("Train number->"+" "+train.getTrainNumber() +  "   " + "Train Name->"+" "+ train.getTrainName()); 
		}
		System.out.println("------------------------------------");
		
		//Asking passenger count
		System.out.println("Passenger Count(max 4 passenger allowed)-->");
		int passengerCount = scan.nextInt();
		Passenger[] passengers =new Passenger[passengerCount];
		
		int id=1;
		
		while (passengerCount != 0) {
			Passenger psg= new Passenger();
			psg.setId(id);
			psg.setBookedOn(new Date());
			psg.setBookingStatus(BookingStatus.BOOKED); 
			
			System.out.println("Enter passenger "+id+ " name :" );
			String name = scan.next();
			psg.setName(name);
			
				
			System.out.println("Enter passenger "+id+ " age :" );
			Integer age=scan.nextInt();
			psg.setAge(age);

			System.out.println("Enter passenger "+id+ " gender :" );
			String gender= scan.next();
			psg.setGender(gender.charAt(0));
			
			
			psg.setAddress(address);
			
			id++;
			passengerCount--;
		}
		
	}

//----SHOW BOOKING
	protected static void showBoking()

	{System.out.println("2. Show");
	}
//----CANCEL BOOKING
	
	protected static void cancelBooking()

	{System.out.println("3. Cancel");
	}
	
}