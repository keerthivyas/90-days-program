package freeJava.week3;

import java.util.Scanner;

public class LargestAndSmallestofArray {

	public static void main(String[] args) {
		
		int min,max;
		
		int[] arr = new int[5];
		
		
        Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter 5 element : ");
		
		for (int i = 0; i <5; i++) {
			
			arr[i]=input.nextInt();
			
		}
		
		max = arr[0];
		min = arr[0];
		
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]>max) {
				
				max = arr[i];
				
			}
			
           if (arr[i]<min) {
				
				min = arr[i];
				
			}
			
		}

		System.out.println("Largest number in an array " + max);
		
		System.out.println("Smallest number in an array " + min);
		
				
	}

}
