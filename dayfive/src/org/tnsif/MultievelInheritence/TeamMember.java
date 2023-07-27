package org.tnsif.MultievelInheritence;

public class TeamMember extends TeamLeader{
public TeamMember(String deptname, String name, String leadName, int id, String project,int size,int duration) {
		super(deptname, name, leadName, id, project);
		this.size=size;
		this.duration=duration;
		// TODO Auto-generated constructor student
	}
private int size;
private int duration;
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
}
}
