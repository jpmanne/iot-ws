package com.hit.iot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "user_details")
public class UserDetails {
	@Id
	private long id;
	private String email;
	private String password;
	private String name;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private String status;
	private String role;
	private Date createAt;
	public long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public String getStatus() {
		return status;
	}
	public String getRole() {
		return role;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pinCode=" + pinCode + ", status=" + status + ", role=" + role + ", createAt=" + createAt + "]";
	}
}