package practiceJava.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertAnElement {

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
		
		System.out.println("Enter Index Position where new element needs to insert between 1 to "+range);
		
		int pos = input.nextInt();
		
		System.out.println("Enter number to be added at "+pos);
		
		int number = input.nextInt();
		
		list.add(pos, number);
		
		
		System.out.println("ArrayList after adding an element ");
		
		System.out.println(list);
		
		
		
	}

}
