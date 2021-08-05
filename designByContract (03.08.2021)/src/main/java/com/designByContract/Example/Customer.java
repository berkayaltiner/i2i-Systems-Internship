package com.designByContract.Example;

import java.time.LocalDate;

public class Customer {

	private String fullName;
	private int age;
	private LocalDate rentDate;
	
	
	public Customer(String fullName, int age, LocalDate rentDate) {
		this.fullName = fullName;
		this.age = age;
		this.rentDate = rentDate;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public LocalDate getRentDate() {
		return rentDate;
	}


	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}
	
	
	
	
}
