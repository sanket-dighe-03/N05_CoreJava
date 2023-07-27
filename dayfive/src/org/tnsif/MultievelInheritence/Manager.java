package org.tnsif.MultievelInheritence;

public class Manager {
private String dept;
private String name;
private int id;
public Manager() {
	
	System.out.println("default constructor");
	
}
//parametrized cont
public Manager(String dept, String name, int id) {
	super();
	this.dept = dept;
	this.name = name;
	this.id = id;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Manager [dept=" + dept + ", name=" + name + ", id=" + id + "]";
}

}
