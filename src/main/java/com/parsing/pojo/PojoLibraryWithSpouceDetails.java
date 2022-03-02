package com.parsing.pojo;

public class PojoLibraryWithSpouceDetails {
	
	public String name;
	public String empID;
	public String email;
	public Object spouce;
	
	public PojoLibraryWithSpouceDetails(String name, String empID, String email, Object spouce) {
		super();
		this.name = name;
		this.empID = empID;
		this.email = email;
		this.spouce = spouce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Object getSpouce() {
		return spouce;
	}
	public void setSpouce(Object spouce) {
		this.spouce = spouce;
	}
	
	

}
