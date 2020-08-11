package free90.week2;

import java.util.Scanner;

public class HcfAndLcm {

	public static void main(String[] args) {
		
		int x,y,a,b,temp,hcf,lcm;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		x = input.nextInt();
		
		y = input.nextInt();
		
		a = x;
		b = y;
		
		while (b != 0) {
			
			temp = b;
			b = a%b ;
			a = temp;	
		}
		
		hcf = a;
		lcm = (x*y)/hcf;
		
		System.out.println(" HCF of two numbers = "+ hcf);
		
		System.out.println(" LCM of two numbers = "+ lcm);
		
	}

}
