package Module02Lab;
import java.util.Scanner;


public class Module02Lab {

	
	public static void main(String[] args) {
	
		System.out.print("Computer ");
		System.out.println("Science");
		
		
			String scifi = "Science";
		
		System.out.println("Computer " + scifi);
		
		System.out.println();
		// Write code that reads two integers num1 & num2 then prints their sum &
				// product
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter two integers: ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			int sum = num1 + num2;
		    int product = num1 * num2;
			
		    System.out.println("The sum of the numbers is: " + sum);
	        System.out.println("The product of the numbers is: " + product);
	     
	        
	     System.out.println();
			// Write code that reads three integers num, val, and mult, then outputs the
			// result of adding num & val together then multiplying that sum by mult.
	        
	     
	     System.out.println("Enter three integers: ");	    //(num1 + num2) * num3
	 		int num = scan.nextInt();
	 		int val = scan.nextInt();
	 		int mult = scan.nextInt();
		
	 		int sum1 = num + val;
	 		int product1 = sum1 * mult;
	 		
	 		System.out.println("The result is: " + product1);
	 		
	 	
	 	 System.out.println();
	 		// Write code that reads an integer named start then prints the square (n*n)
			// cube (n*n*n) of start.
	 	  
	 	 
	 	 	System.out.print("Enter a number (start): ");
	 	 	int start = scan.nextInt();
	 	 	
	 	 		int square = start * start;
	 	 		int cube = start * start * start;
	        
	        System.out.println("Square root of " + start + ": " + square);
	        System.out.println("Cube root of " + start + ": " + cube);
	 	 	
	        
	      System.out.println();
	      // Write code that reads in 4 numbers: val1, val2, val3, & val4 then calculates
	      // the average (mean) of the 4 numbers.	
	      
	      System.out.println("Enter 4 numbers: ");
	      		int val1 = scan.nextInt();
	      		int val2 = scan.nextInt();
	      		int val3 = scan.nextInt();
	      		int val4 = scan.nextInt();
	      		
	      			int sum2 = val1 + val2 + val3 + val4;
	      			int mean = sum2 / 4;
	      		System.out.println("The mean of the numbers is: " + mean);	
	      
		
	      System.out.println();
		// Write code that reads in 4 numbers representing the number of quarters,
		// dimes, and nickels & pennies someone has, then calculates the total
		// monetary value of the coins. Display the total number of coins
		// followed by the total monetary value.

	      
	      	System.out.println("Enter the number of quarters: ");
	      		int quarters = scan.nextInt();
	      	System.out.println("Enter the number of dimes: ");
	      		int dimes = scan.nextInt();
	      	System.out.println("Enter the number of nickels: ");
	      		int nickels = scan.nextInt();
	      	System.out.println("Enter the number of pennies: ");
	      		int pennies = scan.nextInt();
	      
	      	
	      		
	      	int totalCoins = quarters + dimes + nickels + pennies;
	      	double totalMonetary = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
	      	
	      	System.out.println("The total value is $" + totalMonetary);
	      	
	      	
	     System.out.println();  
		// Read in a name, number, thing & place, then print the sentence
		// NAME has brought a THING to PLACE NUMBER times
		// replacing NAME, THING, PLACE, & NUMBER with the inputs
	     
	     
	     String id = scan.nextLine();
	  System.out.println("Enter a name: ");
	  		String name = scan.nextLine();
	  
	  System.out.println("Enter a thing: ");
		  	String thing = scan.nextLine();
		  	
	 System.out.println("enter a place: ");
			String place = scan.nextLine();
	  
	  System.out.println("Enter a number: ");
		  	int number = scan.nextInt();
		  	
		  
	       
	  System.out.println(name + " has brought a " + thing + " to " + place + " " + number + " times ");
	 
		

	}

} 