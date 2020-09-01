package com.sort.insertion;

public class insertionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 11, 13, 5, 6 }; 
		  
        insertionSort ob = new insertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
        
	}
	
	
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 

}
