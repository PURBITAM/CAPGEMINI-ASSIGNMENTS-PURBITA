package com.capgemini.lab9.streamapi.casestudy;

public class Department 
{
	private Integer departmentId;
	private String departmentName;
	private Integer managertId;
	
	public Department() {
		super();
	}
	public Department(Integer departmentId, String departmentName, Integer managertId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managertId = managertId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmantName) {
		this.departmentName = departmentName;
	}
	public Integer getManagertId() {
		return managertId;
	}
	public void setManagertId(Integer managertId) {
		this.managertId = managertId;
	}
	
	
}
