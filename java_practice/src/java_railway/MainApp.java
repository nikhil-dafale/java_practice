package java_railway;

import java.util.Scanner;

public class MainApp {
	
	//property created to iterate bookings
	private static int nextBookingIndex = 0;
	
	private static final int EXIT = 4;

	public static void main(String[] args) {
		
	
			
		Scanner scan =new Scanner(System.in);
		System.err.println("Enter number of Bookings");
		int bookingCount = scan.nextInt();
		
		Booking[] bookings = new Booking[bookingCount];
		System.out.println("Accepted Bookings-->"+ bookings.length);
		
		System.out.println("-------------------------------------");
		
		int options=0;
		
		//Iterating using do-while
		do {
			System.out.println("====Reservation Type====");
			System.out.println("1. NEW\n 2. SHOW\n 3. CANCEL\n 4. EXIT");
			
			System.out.print("Please Enter your choice");
			options = scan.nextInt();
			
			switch (options) {
			case 1:
				BookingUtility.startNewBooking(bookings, nextBookingIndex);
				nextBookingIndex++;
				break;
			case 2:
				BookingUtility.showBoking();
				break;
			case 3:
				BookingUtility.cancelBooking();
				break;
				
			case 4:
				System.out.println("Exit booking");
				break;
			
			default:
				System.err.println("Please enter correct option");
				break;
			}
			
			
		} while (options != EXIT);
		
		System.err.println("-------Process Completed------");

		
		
		
		
	}
	
	
}
