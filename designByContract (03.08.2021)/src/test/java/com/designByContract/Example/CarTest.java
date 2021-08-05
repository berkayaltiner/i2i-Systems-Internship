package com.designByContract.Example;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

	private Car _car;
	
	@BeforeEach
	void init()
	{
		_car = new Car();
	}
	
	@Test
	void rentCarTest()
	{
		Customer customer1 = new Customer("Berkay Altıner", 20, LocalDate.of(2021, 8, 5));
		_car.rentCar(customer1);
		
	}
	
	
}
