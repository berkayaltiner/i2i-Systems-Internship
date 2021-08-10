package com.dynamicFibonacci;

import java.util.Scanner;

public class dynamicFibonacci {
	
	public static long recursiveFibonacci(int number)
	{
		if (number == 0 || number == 1) {
			return number;
		}
		
		return recursiveFibonacci(number-2) + recursiveFibonacci(number-1);
		
	}
	
	public static long memorizedFibonacci(int number, long[] fibArray) // From Top to Down
	{
		if (number == 0 || number == 1) {
			return number;
		}
		
		if(fibArray[number] != 0)
			return  fibArray[number];
		
		fibArray[number] = memorizedFibonacci(number - 2, fibArray) + memorizedFibonacci(number - 1, fibArray);
		
		
		return fibArray[number];
		
	}
	
	public static long tabulatedFibonacci(int number) // From Bottom to Up
	  {
	    int fibArray[] = new int[number+1];
	    fibArray[0] = 0;
	    fibArray[1] = 1;
	    
	    
	    for (int i = 2; i <= number; i++)
	          fibArray[i] = fibArray[i-1] + fibArray[i-2];
	    
	    
	    return fibArray[number];
	  }
	 
	// My fibonacci code
	
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
	    System.out.println();    
	    return fibonacciArray;
	}
	
	public static boolean checkIsPrime(int givenNumber)
    {
        boolean result = true;

        if (givenNumber < 2)
        {
            result = false;
            System.out.println(givenNumber + " is Prime.\n");
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
                   
                    System.out.println(givenNumber + " is not Prime.\n");
                    return result;      
                }
            }
        }
        System.out.println(givenNumber + " is Prime. \n");
        return result ;
}
	
	public static boolean checkIsPrimeFibonacci(int givenNumber, int sizeOfArray)
    {
        int[] tempArray = createFibonacciSeries(sizeOfArray);

        if (checkIsPrime(givenNumber))
        {
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i] == givenNumber)
                {
                    System.out.println(givenNumber + " is prime and exist in Fibonacci Series.");
                  
                    return true;

                }
            }


            System.out.println(givenNumber + " is prime but doesn't exist in Fibonacci Series.");
           
            return false;
        }
        else
        {
            for (int i = 0; i < tempArray.length; i++)
            {
                if (tempArray[i] == givenNumber)
                {
                	System.out.println(givenNumber + " is not prime but exist in Fibonacci Series.");
                	
                    return false;
                }
            }

            System.out.println(givenNumber + " is not prime and doesn't exist in Fibonacci Series.");
           
            return false;
        }

     }

	
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		number = sc.nextInt();
		
		// Recursive Result
		long startTime = System.nanoTime();
		long result = recursiveFibonacci(number);
		long processTime = System.nanoTime() - startTime;
		double endTime = (double) processTime / 1000000000.0;
		System.out.print("\nRecursive result is: "+ result +"\nPassed time in secconds: "+endTime);
		endTime = startTime = processTime = 0;
		
		// Memorized Result
	    startTime = System.nanoTime();
		result = memorizedFibonacci(number, new long[number+1]);
	    processTime = System.nanoTime() - startTime;
		endTime = (double) processTime / 1000000000.0;
		System.out.print("\nMemorized result is: "+ result +"\nPassed time in secconds: "+endTime);
		endTime = startTime = processTime = 0;
		
		// Tabulated result
		startTime = System.nanoTime();
		result = tabulatedFibonacci(number);
	    processTime = System.nanoTime() - startTime;
		endTime = (double) processTime / 1000000000.0;
		System.out.print("\nTabulated result is: "+ result +"\nPassed time in secconds: "+endTime);
		endTime = startTime = processTime = 0;
		
		// My fibonacci code
		startTime = System.nanoTime();
		boolean boolResult = checkIsPrimeFibonacci(number, number);
	    processTime = System.nanoTime() - startTime;
		endTime = (double) processTime / 1000000000.0;
		System.out.print("\nMy fibonacci code result is: "+ result +"\nPassed time in secconds: "+endTime);
		endTime = startTime = processTime = 0;
		
		
		
	}

}
