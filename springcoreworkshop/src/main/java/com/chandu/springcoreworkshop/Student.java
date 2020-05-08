//Autowiring example
package com.chandu.springcoreworkshop;

public class Student {
	
	private int studentId;
	private Address address;
	
	
	public Student() {
		super();
	}
	public Student(int studentId, Address address) {
		super();
		this.studentId = studentId;
		this.address = address;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", address=" + address + "]";
	}
	
	
	
	

}
