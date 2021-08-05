package com.TDD.primeFibonacci;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimeFibonacciTest {

	private PrimeFibonacci _primeFibonacci;
	
	@BeforeEach
	public void init()
	{ 
		_primeFibonacci = new PrimeFibonacci();
	}
	
	@Test
	public void isPrimeTest()
	{
		int number = 2 ;
		assertTrue(_primeFibonacci.checkIsPrime(number));
	}
	@Test
	public void notPrimeTest()
	{ 
		int number = 4;
		assertFalse(_primeFibonacci.checkIsPrime(number));
	}
	
	@Test
	public void isPrimeAndFibonacciTest()
	{
	   int number = 13;
	   assertTrue(_primeFibonacci.checkIsPrimeFibonacci(number, number));
	}
	
	@Test
    public void isPrimeNotFibonacciTest()
	{
		int number = 7;
		assertFalse(_primeFibonacci.checkIsPrimeFibonacci(number, number));
	}
	
	
	@Test
    public void notPrimeIsFibonacciTest()
	{
		int number = 8;
		assertFalse(_primeFibonacci.checkIsPrimeFibonacci(number, number));
	}
	
	@Test
	public void notPrimeNotFibonacciTest()
	{
		int number = 28;
		assertFalse(_primeFibonacci.checkIsPrimeFibonacci(number, number));
	}
	
	

	
}
