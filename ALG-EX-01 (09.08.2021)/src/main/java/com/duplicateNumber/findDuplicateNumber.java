package com.duplicateNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.tools.javac.Main;

public class findDuplicateNumber {
	 
	  static Logger logger = LogManager.getLogger(findDuplicateNumber.class);
	  
	  static void findDuplicates (int arr[], int arraySize)
		    {
	
		        // initialize ifPresent as false
		        boolean ifPresent = false;
		 
		        // ArrayList to store the output
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        for (int i = 0; i < arraySize - 1; i++) {
		            for (int j = i + 1; j < arraySize; j++) {
		                if (arr[i] == arr[j]) {
		                    // checking if element is
		                    // present in the ArrayList
		                    // or not if present then break
		                    if (list.contains(arr[i])) {
		                    	logger.info("This number aldready checked : " + arr[i]);
		                        break;
		                    }
		 
		                    // if element is not present in the
		                    // ArrayList then add it to ArrayList
		                    // and make ifPresent at true
		                    else {
		                    	
		                        list.add(arr[i]);
		                        ifPresent = true;
		                        logger.info("Duplicated number : " + arr[i]);
		                    }
		                }
		            }
		        }
		 
		        // if duplicates is present
		        // then print ArrayList
		        if (ifPresent == true) {
		 
		            System.out.print(list + " ");
		            logger.info("List of duplicated numbers : " + list.toString());
		        }
		        else {
		            System.out.print(
		                "No duplicates present in arrays");
		        }
		    }
 
    // Driver code
    public static void main(String[] args)
    {
    	
    	
    	System.out.print("1. Array result: ");
        int arr[] = { 1,2,4,8,3 };
        int arraySize = arr.length;
        findDuplicates(arr, arraySize);
        
       
        System.out.print("\n2. Array result: ");
        int arr2[] = { 4,6,12,5,5,89 };
        int array2Size = arr2.length;
        findDuplicates(arr2, array2Size);
        
        System.out.print("\n3. Array result: ");        
        int arr3[] = { 4,3,8,8,35,35,12 };
        int array3Size = arr3.length;
        findDuplicates(arr3, array3Size);
        
        System.out.print("\n4. Array result: ");
        int arr4[] = { 5,6,78,5};
        int array4Size = arr4.length;
        findDuplicates(arr4, array4Size);
    }
}
