package free90.week2;

public class BubbleSort {

	public static void main(String[] args) {
		
		int numbers[] = {33,53,43,35,54,12};
		
		int temp=0;
		
		System.out.println("Number Before Sort: ");
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i]+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 1; j < numbers.length-i; j++) {
				
				if (numbers[j-1] > numbers[j]) {
					
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;	
					
				}		
			}
		}
		
		
        System.out.println("Number After Sort: ");
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i]+" ");
			
		}
		

	}

}
