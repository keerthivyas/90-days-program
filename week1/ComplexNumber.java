package free90.week1;

public class ComplexNumber {

	
	   int real, img;
		
	   
	    public ComplexNumber(int r, int i){
		real = r;
		img = i;
		
		System.out.println("Complex Number : "+ real+" + "+ img +"i");
		
		
	   }
		
	   public ComplexNumber() {
		
	}

	public static ComplexNumber addComplex(ComplexNumber c1, ComplexNumber c2)
	   {

	        ComplexNumber c3 = new ComplexNumber();

	        c3.real = c1.real + c2.real;
	        c3.img = c1.img + c2.img;
	   
	        return c3;
	        
	    }
	   
	   
	    public static void main(String args[]) {
	    	
		ComplexNumber c1 = new ComplexNumber(9, 4);
		ComplexNumber c2 = new ComplexNumber(11, 8);
		
	    ComplexNumber c3 = addComplex(c1, c2);
	    
	    System.out.println("Sum of Complex Number: "+ c3.real+" + "+ c3.img +"i");
	    
	    }	
	
}