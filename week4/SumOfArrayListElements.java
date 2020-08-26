package practiceJava.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArrayListElements {

	public static void main(String[] args) {
		
        System.out.println("Enter a range of numbers: ");
		
		Scanner input = new Scanner(System.in);
		
		int range = input.nextInt();
		
		System.out.println("Enter "+range+" numbers: ");
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < range; i++) {
			list.add(input.nextInt());
		}
		
		System.out.println("ArrayList: ");

		for (int i = 0; i < range; i++) {
			System.out.println(list.get(i));
			
		}
		
		int sum = 0;
		
		for (int i = 0; i < range; i++) {
			
			sum = sum + list.get(i);
			
		}
		
		System.out.println("Sum of elements in Array list: "+sum);
		
		
	}

}
