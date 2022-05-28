import java.util.Scanner;  // Import the Scanner class
public class one   //match the class name
 {
	public static void main(String[]  args) {
		
		Scanner Obj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter three number one by one");

		  
		  double no1 = Obj.nextDouble();	  //Reads a double value from the user
		  double no2 = Obj.nextDouble();	  //Reads a double value from the user
		  double no3 = Obj.nextDouble();	  //Reads a double value from the user
		  double ave=(no1+no2+no3)/3;
		 
		  
	        
		   System.out.println("The average is " + ave);
		  
		   
		  
		    
		    
	}


}