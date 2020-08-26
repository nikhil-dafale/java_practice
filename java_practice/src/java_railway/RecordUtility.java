package java_railway;

import java.util.Date;

public abstract class RecordUtility {

	protected static Train[] getTrains() {
		// creating train object to pass on train array
		Train[] trains = new Train[5];
		
		Train t1=new Train();
		t1.setTrainNumber(111000);
		t1.setTrainName("The 11 train");
		t1.setArrival(new Date());
		t1.setDeparture(new Date());
		
		Train t2=new Train();		
		t2.setTrainNumber(222000);
		t2.setTrainName("The 22 train");
		t2.setArrival(new Date());
		t2.setDeparture(new Date());
		
		Train t3=new Train();
		t3.setTrainNumber(333000);
		t3.setTrainName("The 33 train");
		t3.setArrival(new Date());
		t3.setDeparture(new Date());
		
		Train t4=new Train();
		t4.setTrainNumber(444000);
		t4.setTrainName("The 44 train");
		t4.setArrival(new Date());
		t4.setDeparture(new Date());
		
		Train t5=new Train();
		t5.setTrainNumber(555000);
		t5.setTrainName("The 55 train");
		t5.setArrival(new Date());
		t5.setDeparture(new Date());
		
		// Storing object on array index
		trains[0] = t1;
		trains[1] = t2;
		trains[2] = t3;
		trains[3] = t4;
		trains[4] = t5;

		return trains;
	}

}
