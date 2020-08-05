package free90.week1;

public class SumOfMultipleNumbersMO {
	
	

	public static void main(String[] args) {
		
		SumOfMultipleNumbersMO sum = new SumOfMultipleNumbersMO();
		
		sum.add(10,20);
		
		sum.add(10,20,30);
		
		sum.add(10,20,30,40);
	}

	private void add(int i, int j, int k, int l) {
		
		 int sum = i + j + k + l;
			
	     System.out.println("Sum of four numbers = "+sum);
		
	}

	private void add(int i, int j, int k) {
		
         int sum = i + j + k;
		
		System.out.println("Sum of three numbers = "+sum);
		
		
	}

	private void add(int i, int j) {
		
		int sum = i + j;
		
		System.out.println("Sum of two numbers = "+sum);
		
	}

}
