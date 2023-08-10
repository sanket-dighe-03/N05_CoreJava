package org.tnsif.singledimensionalArray;
//program to demonstrate on array of object

public class Employee {
private int ID;
private String name;
private double s;
//parametrized constructor
public Employee(int iD, String name, double s) {
	super();
	ID = iD;
	this.name = name;
	this.s = s;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getS() {
	return s;
}
public void setS(double s) {
	this.s = s;
} 
}
