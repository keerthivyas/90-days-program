package practiceJava.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveAString {

	public static void main(String[] args) {
		// Condition starts with 's' and size is greater than 5
		
		System.out.println("Enter a range of numbers: ");
		
		Scanner input = new Scanner(System.in);
		
		int range = input.nextInt();		
		
		List<String> list= new ArrayList<String>();
		
		System.out.println("Enter "+range+" Strings: ");
		
		for(int i = 0;i<range;i++) {
			
			list.add(input.next());
			
		}
		System.out.println(list);
		
		for (int i = 0; i <range; i++) {
			
			int length = list.get(i).length();
			
			if ((list.get(i).startsWith("S"))&&(length>5)) {
				list.remove(i);
				range = range - 1;
				
			}
			
			
		}
		
		System.out.println(list);

	}

}
