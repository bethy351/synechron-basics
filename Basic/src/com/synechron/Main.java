package com.synechron;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// print
		System.out.println("hello");
		// array : set of similar type of elements.
		// array index L will start with 0 and ends with size -1
		// int array declaration
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 1000);
		}

		// to transverse the array
		// for each loop
		// will build the implicit conditindition to transverse, increment counter and
		// directly assign to i

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("eneter value to delette from array");
		int userInput = scanner.nextInt();
		// nextXXX() : XXX: name of the data type
		// delete the value?
		// delete the index?

		System.out.println(userInput);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == userInput) {
				System.out.println("number found and deleted");
				//i+1 => i .... if i+l (a.length) should place 0.
				
				a[i] = 0;

			}
		}
		for (int i : a) {
			System.out.println(i);

			// cntrl shift  to format
s	}
	}

}
