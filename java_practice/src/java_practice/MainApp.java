package java_practice;

import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		// creating college1 object
		College1 college1 = new College1();
		college1.setCollegeName("BDCE");

		// creating address for college 1
		Address college1Address = new Address();
		college1Address.setDoor(101);
		college1Address.setBuilding("A-wing");
		college1Address.setLandmark("Shivaji square");
		college1Address.setTaluka("Seloo");
		college1Address.setDistrict("Wardha");
		college1Address.setState("Mah");
		college1Address.setPincode(442001);
		college1Address.setRented(true);

		PersonalInformation personalInformation = new PersonalInformation();
		personalInformation.setContact(9823239105l);
//		personalInformation.setAge((short) 30);
//		personalInformation.setDob(new Date("21-06-1992"));
		personalInformation.setEmail("bdce@gmail.com");
		// personal---address---college
		college1Address.setPersonalInformation(personalInformation);

		// Setting address to college1 with college1Address
		college1.setAddress(college1Address);

		Employee[] employees = new Employee[2];

		Employee employee1 = new Employee();
		employee1.setType("Intern");

		Address employeeAddress1 = new Address();
		employeeAddress1.setDoor(221);
		employeeAddress1.setBuilding("z-wing");
		employeeAddress1.setLandmark("Z square");
		employeeAddress1.setTaluka("Pimpri");
		employeeAddress1.setDistrict("Pune");

		employee1.setAddress(employeeAddress1);
		employees[0]= employee1;
		//-----------------------------------------------------
		Employee employee2 = new Employee();
		employee2.setType("Professor");

		Address employeeAddress2 = new Address();
		employeeAddress2.setDoor(221);
		employeeAddress2.setBuilding("t-wing");
		employeeAddress2.setLandmark("t square");
		employeeAddress2.setTaluka("Chinchwad");
		employeeAddress2.setDistrict("Pune");

		employee2.setAddress(employeeAddress2);
		employees[1]=employee2;
				
		college1.setEmployees(employees);
		System.out.println(college1);
	}

}
