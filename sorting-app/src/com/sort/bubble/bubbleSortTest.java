package com.sort.bubble;

public class bubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSort ob = new bubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array: "); 
        ob.printArray(arr); 

	}
	

}
