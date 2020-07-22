package java_practice;

import java.util.Arrays;

public class College2 extends University {
	private String collegeName;
	private Address address;
	private Employee[] employees;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "College2 [collegeName=" + collegeName + ", address=" + address + ", employees="
				+ Arrays.toString(employees) + "]";
	}

}
