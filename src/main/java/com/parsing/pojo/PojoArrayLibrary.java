package com.parsing.pojo;

public class PojoArrayLibrary {
	
	public String  name;
	public String  empID;
	public String  email;
	public long[]  phnNo;
	
	public PojoArrayLibrary(String name, String empID, String email, long[] phnNo) {
		super();
		this.name = name;
		this.empID = empID;
		this.email = email;
		this.phnNo = phnNo;
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
	public long[] getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long[] phnNo) {
		this.phnNo = phnNo;
	}
	
	
	

}
