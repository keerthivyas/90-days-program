package freeJava.week3;

import java.util.Scanner;

public class PrintString5 {

	public static void main(String[] args) {
		
        String[] arr = new String[5];
		
		
        Scanner input = new Scanner(System.in);
        
       
		System.out.println("Enter elements : ");
		
		for (int i = 0; i <5; i++) {
			
			arr[i] = input.next();
			
		}

		System.out.println("String with more than 5 characters : ");
		
         for (int i = 0; i <5; i++) {
			
        	 if (arr[i].length()>5) {
        		 
        		 System.out.println(arr[i]);
				
			}		
			
		}
		
	}

}
