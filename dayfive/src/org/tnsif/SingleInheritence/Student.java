package org.tnsif.SingleInheritence;

public class Student extends Citizen {
	private String collegename;
	private int rollno;
	public Student()
	{
		super();
		System.out.println("child class default constructor");
	}
	
	public Student(String city, int pincode, long aadharNo, long contact, String collegename, int rollno) {
		super(city, pincode, aadharNo, contact);
		this.collegename = collegename;
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", rollno=" + rollno + ", toString()=" + super.toString() + "]";
	}
	



}
