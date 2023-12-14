package com.synechron.array;

public class ArrayDemo3 {
	// we need object ==?>
	
	
	
	public boolean isValuePresent(int value) {
		
		int a[] = {10,20,24,12,200,1000};
		
		for (int i : a) {
			if (i == value) {
				return true;
			
			}
			
			
		}
		
		return false;
		
	}
	
	public static void main (String[] args) {
		// arrayDemo3 us reference, ArrayDemo is object 
		// new object is executed at runtime 
		ArrayDemo3 arrayDemo3 = new ArrayDemo3(); // constructor. to initilize the object with some values/ will take default values
		//new will create object in heap memory
		boolean result = arrayDemo3.isValuePresent(220);
		
		System.out.println(result);
	}

}
