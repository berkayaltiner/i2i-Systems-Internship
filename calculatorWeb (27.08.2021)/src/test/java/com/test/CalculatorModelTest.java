package com.test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.tempuri.Calculator;


import com.operations.CalculatorModel;

public class CalculatorModelTest {

private static final Logger logger  = LogManager.getLogger(CalculatorModel.class);
	
	@Test
	public void testIndex() {
		try {
			
			CalculatorModel  CalculatorModel = new CalculatorModel(new Calculator().getCalculatorSoap12());
			Random rand = new Random();
			logger.info("TEST RUN");
			for(int i = 0; i < 100; i++)
			{
				int number1 = rand.nextInt(10000);
				int number2 = rand.nextInt(10000);
				
				logger.debug("Olması gereken Sayı 1 = " + number1 + " Sayı 2 = " + number2 + " Toplam = " + (number1 + number2)+ " Çıkarma = "+ (number1 - number2)+ " Çarpma = "+ (number1 * number2)+ " Bölme = " +(int)Math.ceil((number1 / number2)));
				
				assertEquals((number1 + number2) , CalculatorModel.calculate("Add", number1, number2));
				logger.debug(CalculatorModel.calculate("Add", number1, number2));
				
				assertEquals((number1 - number2), CalculatorModel.calculate("Substract", number1, number2));
				logger.debug(CalculatorModel.calculate("Substract", number1, number2));
				
				assertEquals((number1 * number2), CalculatorModel.calculate("Multiply", number1, number2));
				logger.debug(CalculatorModel.calculate("Multiply", number1, number2));
				
				if(number2 == 0) {
					
			      logger.debug("0'a bölünemez !");
				
				}
				else if (number2 > number1) {
					
					assertEquals(0 , CalculatorModel.calculate("Divide", number1, number2),1);
					logger.debug(CalculatorModel.calculate("Divide", number1, number2));
				}
				else {
					assertEquals((number1/number2) , CalculatorModel.calculate("Divide", number1, number2),1);
					logger.debug(CalculatorModel.calculate("Divide", number1, number2));
				}
			}
			logger.info("THE TEST RAN SUCCESSFULLY");
		} catch (Exception e)
		{
			logger.error(e);
		}

	}
}
