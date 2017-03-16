package kr.or.dgit.mybatis_dev.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> courses;			// 일대다 매핑, 교사가 여러 과목을 가르칠 수 있다.
	private Gender gender;
	
	
	public Tutor(int tutorId, String name, String email, Gender gender) {
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public int getTutorId() {
		return tutorId;
	}
	
	
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s", tutorId, name, email, address, courses);
	}
	
	
	
}
