package freeJava.week3;

import java.util.Scanner;

public class PrintOddAndEven {

	public static void main(String[] args) {
        
		int[] arr = new int[5];
		
        Scanner input = new Scanner(System.in);
        
		System.out.println("Enter 5 numbers : ");
		
		for (int i = 0; i <5; i++) {
			
			arr[i]=input.nextInt();
			
		}
		
		System.out.println("Even Numbers : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0) {
				
				System.out.print(arr[i]+" ");
			}
			
		}
		
		System.out.println();
		
        System.out.println("Odd Numbers : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2!=0) {
				
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
