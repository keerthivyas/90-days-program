package freeJava.week3;

import java.util.Scanner;

public class AverageNumbersArray {

	public static void main(String[] args) {
		
		float avg, sum =0;
		
        int[] arr = new int[5];
		
		
        Scanner input = new Scanner(System.in);
        
       
		System.out.println("Enter elements : ");
		
		for (int i = 0; i <5; i++) {
			
			arr[i]=input.nextInt();
			
		}

		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		
		avg = sum / arr.length ;
		
		System.out.println("Sum of an array "+sum);
		
		System.out.println("Average of an array "+avg);
		
		
	}

}
