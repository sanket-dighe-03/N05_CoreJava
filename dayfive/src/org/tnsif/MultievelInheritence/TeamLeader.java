package org.tnsif.MultievelInheritence;
//child class 2
//parent class 2
public class TeamLeader extends Manager  {
	private String LeadName;
	private int id;
	private String project;
	@Override
	public String toString() {
		return "TeamLeader [LeadName=" + LeadName + ", id=" + id + ", project=" + project + ", toString()="
				+ super.toString() + "]";
	}
	//getters and setters
	public String getLeadName() {
		return LeadName;
	}
	public TeamLeader(String deptname,String name,String leadName, int id, String project) {
		super(dept,name,id);
		this.LeadName = leadName;
		this.id = id;
		this.project = project;
		
	}
	public void setLeadName(String leadName) {
		LeadName = leadName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}

}
