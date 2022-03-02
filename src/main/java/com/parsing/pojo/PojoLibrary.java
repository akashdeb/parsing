package com.parsing.pojo;

public class PojoLibrary {
	
	public String name;
	public String empId;
	public String email;
	public int phoneNo;
	
	public PojoLibrary() {
		// TODO Auto-generated constructor stub
	}
	public PojoLibrary(String name, String empId, String email, int phoneNo) {
		super();
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	
	
	
	
	

}
