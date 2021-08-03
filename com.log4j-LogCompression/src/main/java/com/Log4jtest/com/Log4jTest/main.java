package com.Log4jtest.com.Log4jTest;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

	static final Logger _logger = LogManager.getLogger(main.class);
	
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int sizeOfArray;
	     _logger.debug("Program Started");
         System.out.print("Please enter the size of Fibonacci series : ");
         sizeOfArray = sc.nextInt();
         
         for( int checkNumber = 0 ; checkNumber < sizeOfArray ; checkNumber++) {
         _logger.info("Checked number = " + checkNumber + "Size of Array = " + sizeOfArray);
         checkIsPrimeFibonacci(checkNumber, sizeOfArray);
         }
		_logger.debug("Program finished");
	}

	public static int[] createFibonacciSeries(int sizeOfArray)
	{
	    int number1 = 0, number2 = 1, result=0;
	    int[] fibonacciArray = new int[sizeOfArray];

	    fibonacciArray[0] = 0;
	    fibonacciArray[1] = 1;
	    for (int i = 2; i < sizeOfArray; i++)
	    {

	        result = number1 + number2;
	        number1 = number2;
	        number2 = result;
	        fibonacciArray[i] = result;
            
	    }

	    for (int i = 0; i < fibonacciArray.length; i++)
	    {
	        System.out.println(fibonacciArray[i] + " ");
	        
	    }
	    _logger.info("createFibonacciSeries Created Series. ");
	    System.out.println();    
	    return fibonacciArray;
	}
	
	public static boolean checkIsPrime(int givenNumber)
    {
        boolean result = true;

        if (givenNumber < 2)
        {
            result = false;
            _logger.info("checkIsPrime RETURNED " + result + " value = "+ givenNumber);
            return result;
        }
        else if (givenNumber >= 2)
        {
            for (int i = 2; i < givenNumber - 1 ; i++)
            {
                if (givenNumber % i == 0)
                {
                    result = false;
                    i = givenNumber;
                    _logger.info("checkIsPrime RETURNED " + result + " value = "+ givenNumber);
                    return result;

                }
            }
        }
        
        _logger.info("checkIsPrime RETURNED " + result + " value = "+ givenNumber);
        return result;
        
    }
	 
	
	public static void checkIsPrimeFibonacci(int givenNumber, int sizeOfArray)
    {
        int[] tempArray = createFibonacciSeries(sizeOfArray);

        if (checkIsPrime(givenNumber))
        {
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i] == givenNumber)
                {
                    System.out.println(givenNumber + " is prime and exist in Fibonacci Series.");
                    _logger.info("checkIsPrimeFibonacci RETURNED " + givenNumber + "is prime and exist in Fibonacci Series.");
                    return;

                }
            }


            System.out.println(givenNumber + " is prime but doesn't exist in Fibonacci Series.");
            _logger.info("checkIsPrimeFibonacci RETURNED " + givenNumber + "is prime but doesn't exist in Fibonacci Series.");
            return;
        }
        else
        {
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i] == givenNumber)
                {
                	System.out.println(givenNumber + " is not prime but exist in Fibonacci Series.");
                	_logger.info("checkIsPrimeFibonacci RETURNED " + givenNumber + "is not prime but exist in Fibonacci Series.");
                    return;
                }
            }

            System.out.println(givenNumber + " is not prime and doesn't exist in Fibonacci Series.");
            _logger.info("checkIsPrimeFibonacci RETURNED " + givenNumber + "is not prime but doesn't exist in Fibonacci Series.");
            return;
        }
    }

}


