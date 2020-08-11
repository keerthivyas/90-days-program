package free90.week2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		int n, line;
		
		Scanner row = new Scanner(System.in);
		
		System.out.println("Enter No of rows: ");
		
		n = row.nextInt();
		
		int[][] arr = new int[n][n];
		
		for (line = 0;  line < n; line++) {
			
			for (int i = 0; i <= line; i++) {
				
				if (line == i || i == 0) {
					
					arr[line][i] = 1;
					
				} else {
					
					arr[line][i] = arr[line-1][i-1] + arr[line-1][i];

				}
				
				System.out.print(arr[line][i]+" ");
				
			}
			System.out.println();
			
		}

	}

}
