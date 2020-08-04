package free90.week1;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n=9;
		int i,j,a=1;
		
		for (i = 1; i <= n; i++) {
			
			for ( j = 1; j <= i; j++) {
				
				System.out.print(a+" ");
				a++;
				
			}
			
			System.out.println();
			
		}

	}

}
