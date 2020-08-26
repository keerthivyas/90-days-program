package freeJava.week3;

import java.util.Arrays;
import java.util.Scanner;

public class SwapFirstAndLast {

	public static void main(String[] args) {
		
		String str;
		char temp;
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        str = scan.nextLine();
        
        int n = str.length();
        
        System.out.println("Length of the string : "+n);
        
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
        	System.out.println(ch[i]);
			
		}
        
        temp = ch[0];
        
        ch[0] = ch[ch.length-1];
        
        ch[ch.length-1] = temp;
        
        System.out.println("After swap: ");
        
        for (int i = 0; i < ch.length; i++) {
        	System.out.println(ch[i]);
			
		}
        
        String swappedString = new String(ch);
        
        System.out.println("String after swap: ");
        
        System.out.println(swappedString);
        
	}

}
