package java_practice;

//entity
public class University {
	// properties
	private String UniversityName;
	private String number;
	private Address address;
	private short year;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	@Override
	public String toString() {
		return "University [UniversityName=" + UniversityName + ", number=" + number + ", address=" + address
				+ ", year=" + year + "]";
	}

}
