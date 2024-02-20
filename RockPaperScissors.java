package project.RockPaperScissors;

//Zell Madriaga
//CSC110AB
//February 17, 2024

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		 System.out.println("Please enter your name:");
	        String name = scan.nextLine();
	        
	        
	        
	        System.out.println("Hi " + name + ", welcome to the RockPaperScissors game!");
	        System.out.println("Please select a number from 1-3, (1=Rock, 2=Paper, 3=Scissors): ");

	        int userMove = scan.nextInt();
	        int compMove = rand.nextInt(3) + 1;
	        
	        scan.close();

	        switch(userMove) {
	        case 1:
	        	System.out.println("You chose rock");
	        		if (compMove == 1) {
	        			System.out.println("Computer's move is rock");
	        			System.out.println("It's a tie!");
	        		}
	        		else if (compMove == 2) {
	        			System.out.println("Computer's move is paper");
	        			System.out.println("Paper covers rock, you lose");
	        		}
	        		else if (compMove == 3) {
	        			System.out.println("Computer's move is scissors");
	        			System.out.println("Rock crushes scissors, you win!");
	        		}
	        		break;
	        case 2:
	        	System.out.println("You chose paper");
        		if (compMove == 1) {
        			System.out.println("Computer's move is rock");
        			System.out.println("Paper covers Rock, you win!");
        		}
        		else if (compMove == 2) {
        			System.out.println("Computer's move is paper");
        			System.out.println("It's a tie!");
        		}
        		else if (compMove == 3) {
        			System.out.println("Computer's move is scissors");
        			System.out.println("Scissors cut Paper, you lose!");
        		}
        		break;
	        case 3:
	        	System.out.println("You chose scissors");
        		if (compMove == 1) {
        			System.out.println("Computer's move is rock");
        			System.out.println("Rock crushes Scissors, you lose");
        		}
        		else if (compMove == 2) {
        			System.out.println("Computer's move is paper");
        			System.out.println("Scissors cut Paper, you win");
        		}
        		else if (compMove == 3) {
        			System.out.println("Computer's move is scissors");
        			System.out.println("It's a tie");
        		}
        		break;
        		
        
	        }
	   
	        }
	    }
	    