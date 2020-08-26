package practiceJava.week4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RetainSameElementsTwoSets {

	public static void main(String[] args) {
		
        System.out.println("Enter a range of numbers: ");
		
		Scanner input = new Scanner(System.in);
		
		int range = input.nextInt();

		Set<Integer> setFirst = new HashSet<Integer>();
		
		System.out.println("Enter "+range+" numbers for 1st set ");
		
		for (int i = 0; i < range; i++) {
			
			setFirst.add(input.nextInt());
			
		}
		
		System.out.println(setFirst);
		
        Set<Integer> setSecond = new HashSet<Integer>();
		
		System.out.println("Enter "+range+" numbers for 2nd set ");
		
		for (int i = 0; i < range; i++) {
			
			setSecond.add(input.nextInt());
			
		}
		System.out.println(setSecond);
		
		setFirst.retainAll(setSecond);
		
		System.out.println("Printing same elements in both the sets ");
		
		System.out.println(setFirst);
		
	}

}
