package practiceJava.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateUsingList {

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
		
		for (int i = 0; i < range; i++) {
			for (int j = i+1; j < range; j++) {
				
				if (list.get(i).equals(list.get(j))) {
					
					list.remove(j);
					
					range = range - 1;
					
				}
				
			}
			
		}
		
		System.out.println("\nPrint all the values in the list after removing");
		
		for(int i = 0;i<range;i++) {
			System.out.println(list.get(i));
		}
		
	}

}
