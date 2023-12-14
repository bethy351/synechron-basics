package com.synechron.array;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		int a[] = new int[5];
		// we wull use it when we want to manipluate data 
		// on the basis on index
		for (int i = 0; i < a.length; i++) {
			//This is a for loop where 'i' is the loop variable. This loop will iterate over the array 'a' from the first element (index 0) to the last element (index 'a.length - 1').
			//for every n in the array, when n is smaller than the length of the array it keeps coutning forward 
			a[i]= (int) (Math.random()*100);
			//Inside the for loop, each element of the array 'a' is assigned a random integer value between 0 and 99. Math.random() returns a double value between 0.0 and 1.0, and multiplying it by 100 gives a value between 0.0 and 99.9. The (int) portion is a type cast that will convert this double value to an integer, effectively discarding any decimal fraction.
			//returns a double value with a positive sign 
			// greater than or equal to 0.0 and less than 1.0
			
			
			}
		//when we want to print an array content then
		// we should use forEach loop 
		// for loop of we want to access and manipluate the index, forEach if we just need access
		for (int i : a) {
            if (i % 3 == 0 || i % 7 == 0) {
            	System.out.println(i);
                System.out.println(i + " is divisible by either 3 or 7");
            }
        }
			//This is a for-each loop that iterates over each element 'i' in the array 'a' and prints it to the console using System.out.println(i);. The for-each loop is another way to traverse through an array, and it's commonly used when you don't need to manipulate the array indices, just access the values.
			
		
	
        
	}

}
