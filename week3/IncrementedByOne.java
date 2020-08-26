package freeJava.week3;

import java.util.Scanner;

public class IncrementedByOne {

	public static void main(String[] args) {
		
        int[] arr = new int[5];
		
		
        Scanner input = new Scanner(System.in);
        
       
		System.out.println("Enter 5 numbers : ");
		
		for (int i = 0; i <5; i++) {
			
			arr[i]=input.nextInt();
			
		}

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = arr[i] + 1;
			
		}
		
		System.out.println("Prinitng element in an array after adding 1 : ");
		
        for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}
