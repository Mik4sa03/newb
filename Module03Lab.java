package lab3;

import java.util.Scanner;
import java.util.Random;

public class lab3 {

	public static void main(String[] args) {
		String lab3 = "JavaCode";
		System.out.println(lab3 + " has " + lab3.length() + " characters");
		
		System.out.println(lab3.charAt(2));

		System.out.println(lab3.toLowerCase());

		Random rand = new Random();
		int num = rand.nextInt(12) + 1;
		System.out.println(num);
		
		int num1 = rand.nextInt(51) + 100;
		System.out.println(num1);
		
		int num2 = rand.nextInt(16) - 10;
		System.out.println(num2);
		
		double val = 55.0;
		double result1 = Math.sqrt(val);
		System.out.println(result1);
		
		double result2 = Math.pow(val, 3);
		System.out.println(result2);
		
		System.out.print("Computer ");
		System.out.println("Science");
		
		String scifi = "Science";
		System.out.println("Computer " + scifi);
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String name = scanner.nextLine();
	        System.out.println("The length of the string: " + name.length());
	        
	        char secondChar = name.charAt(1);
	        char fifthChar = name.charAt(4);
	        System.out.println("The 2nd character: " + secondChar);
	        System.out.println("The 5th character: " + fifthChar);
	        
	        String modifiedString = name.replace('a', '@').replace('s', '$');
	        System.out.println("Modified string: " + modifiedString);
	        
		int first3 = rand.nextInt(900)+100;
		int last4 = rand.nextInt(9000)+1000;
		System.out.println("Random Phone number: " + first3 + "-" + last4);
		
		System.out.println("Enter the x-coordinate of the first point:");
        double xcoordinate = scanner.nextDouble();
        System.out.println("Enter the y-coordinate of the first point:");
        double ycoordinate = scanner.nextDouble();
        
        System.out.println("Enter the x-coordinate of the second point:");
        double xcoordinate2 = scanner.nextDouble();
        System.out.println("Enter the y-coordinate of the second point:");
        double ycoordinate2 = scanner.nextDouble();
        
        double horizontalaxis = xcoordinate2 - xcoordinate;
        double verticalaxis = ycoordinate2 - ycoordinate;
        
        double horizontalsquared = Math.pow(horizontalaxis, 2);
        double verticalSquared = Math.pow(verticalaxis, 2);
        
        double distanceSquared = horizontalsquared + verticalSquared;
        
        double distance = Math.sqrt(distanceSquared);
        
        System.out.println("The distance between two points is: " + distance);
        
        
	}

}
