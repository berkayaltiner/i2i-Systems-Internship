package com.designByContract.Example;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Iterator;


public class Car {

	private int carId;
	private String brandName;
	private LocalDate rentDate;
	private LocalDate returnDate;
	private boolean status;
	
	public ArrayList<Car> carList;
	
	public Car()
	{
		carList = new ArrayList<Car>();
		carList.add(new Car(1,"BMW", LocalDate.of(2021,8, 4), LocalDate.of(2021, 8, 5),true));
		carList.add(new Car(2,"Toyota", LocalDate.of(2021,8, 5), LocalDate.of(2021, 8, 7),false));
		carList.add(new Car(3,"Mercedes", LocalDate.of(2021,8, 5), LocalDate.of(2021, 8, 10),false));
		carList.add(new Car(4,"Volkswagen", LocalDate.of(2021,8, 5), LocalDate.of(2021, 8, 12),false));
			
	}

	public Car(int carId, String brandName, LocalDate rentDate, LocalDate returnDate, boolean status) {
		this.carId = carId;
		this.brandName = brandName;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
		this.status = status;
	}
	
	public void rentCar(Customer _customer)
	{
		assert _customer.getAge() > 18 : "You must be over 18 years old.";
		for(Car car : carList)
		{
			assert car.returnDate.compareTo(_customer.getRentDate()) < 0 : "There are no available cars";
			car.status = true;
			System.out.println("Rented car id is " + car.carId);
			break;
		}
		
		
	}

}