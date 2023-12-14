package com.synechron.array;

import java.util.Iterator;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		String ip ="192.168.1.1";
		
		
		String s[] = ip.split("\\."); // \\ \.==> \\.==> \. ==> .
				
		
				for (String value : s) {
					// check each cel should have the value between 0 and 225
					int cellValue= Integer.parseInt(value);
					// it will transform our string to int value
					
					if(cellValue>=0 && cellValue<=255) {
						System.out.println(value);
					}
					
					else { 
						System.out.println("ip is not valid");
						System.exit(1);
					}
					
				}
				
				int cellOneValue = Integer.parseInt(s[0]); 
				if(cellOneValue>=1 && cellOneValue<=126 ) {
					System.out.println("ip belongs to class A");
				}
				else if (cellOneValue>=128 && cellOneValue>=192) {
					System.out.println("IP belongs to class b");
				}
				
			      // Search for a specific value in the array
		        String searchValue = "168"; // Replace "168" with the value you want to search for
		        boolean found = false;
		        for (String value : s) {
		            if (value.equals(searchValue)) {
		                found = true;
		                break;
		            }
		        }
		        if (found) {
		            System.out.println("Value " + searchValue + " is present in the array");
		        } else {
		            System.out.println("Value " + searchValue + " is not present in the array");
		        }
		    
		
		
	}

}
