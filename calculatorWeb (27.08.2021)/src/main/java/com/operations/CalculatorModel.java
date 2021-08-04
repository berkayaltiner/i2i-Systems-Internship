package com.operations;


import org.tempuri.CalculatorSoap;


public class CalculatorModel {
	  private CalculatorSoap calculatorSoap;
	   
	   
	   public CalculatorModel(CalculatorSoap calculatorSoap)
	   {
		   this.calculatorSoap = calculatorSoap;
	   }

	 public int calculate(String operation,int num1,int num2)
	 {
		 int result = 0;
		
		 
		switch (operation) {
		case "Add":
			result = calculatorSoap.add(num1, num2);
			break;
		case "Substract":
			result = calculatorSoap.subtract(num1, num2);
			break;
		case "Multiply":
			result = calculatorSoap.multiply(num1, num2);
			break;
		case "Divide":
				if(num2 != 0) {
				    result = calculatorSoap.divide(num1, num2); 
				}
				else {
					return 0;
				}
			break;
		default:
			break;
		}
		return result;
	 }
	
	
	
}
