package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Date dob;	
	private Address address;	
	private PhoneNumber phone;		// 우리가 만든 클래스	
	private Gender gender;	
	
	

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	

	public Student(int studId, String name, String email, Date dob, PhoneNumber phone, Gender gender) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
	}

	public Student(int studId, String name, String email, Date dob, PhoneNumber phone) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	

	public Student(int studId, String name, String email, Date dob, Address address, PhoneNumber phone, Gender gender) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
	}

	public Student(int studId, String name, String email, Date dob, Address address, Gender gender) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
	}

	public Student() {	}

	public Student(int studId, String name, String email, Date dob, Gender gender) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s, %s", studId, name, email, dob, phone, address, gender);
	}
}
