package java_practice;

import java_practice.utility.employeeType;

public class Employee {
	private Address address;
	private employeeType type;
	private String fullName;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public employeeType getType() {
		return type;
	}

	public void setType(employeeType type) {
		this.type = type;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", type=" + type + "]";
	}

}
