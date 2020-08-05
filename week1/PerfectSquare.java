package free90.week1;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		double number, sqrt, roundOff;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a number : ");
		
		number = input.nextInt();
		
		sqrt = Math.sqrt(number);
		
		roundOff = Math.floor(sqrt);
		
		if (roundOff*roundOff == number) {
			
			System.out.println("Given Number is a Perfect square");
			
		} else {

			System.out.println("Given Number is not a Perfect square");
		}
		
		
		

	}

}
