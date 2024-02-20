package Lab4;

//Zell Madriaga
//CSC110AB
//2/18/2024

import java.util.Scanner;

public class ItWasAGoodYear {

	static int THISYEAR = 2024;
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("What year would you like to check?");
	        int year = scan.nextInt();

	        System.out.println("Is the year " + year + " correct? Yes or no.");
	        scan.nextLine(); 
	        String userConfirmation = scan.nextLine().trim().toLowerCase();

	        while (userConfirmation.equals("no")) {
	            System.out.println("Please enter the correct year");
	            year = scan.nextInt();
	            System.out.println("Is the year " + year + " correct? Yes or no.");
	            scan.nextLine();
	            userConfirmation = scan.nextLine().trim().toLowerCase();
	        }

	        if (year < THISYEAR) {
	            System.out.println(year + " was " + (THISYEAR - year) + " years ago.");
	        } else if (year > THISYEAR) {
	            System.out.println(year + " is " + (year - THISYEAR) + " years from now.");
	        }
	        
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scan.close();
	    }
	}