package com.nis.model;

import java.sql.Date;

public class StudentModel {
	private int id;
	private String name;
	private String father_name;
	private String dob;
	private String gender;
	private String address;
	private String city;
	private String email;
	private String mobile;
	private int yearofadmission;
	private String enrollmentno;
	private String photo;
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	private String password;
	private String state;
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getYearofadmission() {
		return yearofadmission;
	}
	public void setYearofadmission(int yearofadmission) {
		this.yearofadmission = yearofadmission;
	}
	public String getEnrollmentno() {
		return enrollmentno;
	}
	public void setEnrollmentno(String enrollmentno) {
		this.enrollmentno = enrollmentno;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
