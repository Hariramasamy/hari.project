package com.hari.rdhp.hari.project;

import java.util.UUID;

public class Entity {
	UUID rollNo;
	String firstName;
	String lastName;
	String email;
	String address;
	String district;
	String state;
	String country;
	String mobileNo;
	
	public UUID getRollNo() {
		return rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getmobileNo() {
		return mobileNo;
	}
	
	//Set method
	
	public void setRollNo(UUID paramRollNo) {
		rollNo = paramRollNo;
	}
	
	public void setFirstName(String paramFirstName) {
		firstName = paramFirstName;
	}
	
	public void setLastName(String paramLastName) {
		lastName = paramLastName;
	}
	
	public void setEmail(String paramEmail) {
		email = paramEmail;
	}
	
	public void setAddress(String paramAddress) {
		address = paramAddress;
	}
	
	public void setDistrict(String paramDistrict) {
		district = paramDistrict;
	}
	
	public void setState(String paramState) {
		state = paramState;
	}
	
	public void setCountry(String paramCountry) {
		country = paramCountry;
	}
	
	public void setmobileNo(String paramMobileNo) {
		mobileNo = paramMobileNo;
	}
}
