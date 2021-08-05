package com.TDD.primeFibonacci;

public class PrimeFibonacci {
	
	
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
}