package java_practice;

import java.util.Date;

public class PersonalInformation {
	private long contact;
	private String email;
	private Date dob;
	private short age;

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonalInformation [contact=" + contact + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}

}
