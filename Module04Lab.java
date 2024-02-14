package Lab4;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //[taxDay]

        int income = 2000;
        double taxOwed;

        if (income < 90000) {
            taxOwed = income * 0.22;
        } else {
            taxOwed = income * 0.35;
        }

        System.out.println("Your Tax Owed is $" + taxOwed);

        //[sumGame]

        int num1 = rand.nextInt(20) + 1;
        int num2 = rand.nextInt(20) + 1;

        int correctAnswer = num1 + num2;

        System.out.println("What is the answer of " + num1 + " and " + num2 + "?");
        int userAnswer = scan.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Well done! You got the right answer :)");
        } else {
            System.out.println("Oh no, you're wrong :( The correct answer is " + correctAnswer + ". Better luck next time!");
        }

        //[coinFlip]

        int randNum = rand.nextInt(2);

        if (randNum == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

        //[checkFactors]

        System.out.print("Enter the first number: ");
        int num1st = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2nd = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3rd = scan.nextInt();

        boolean num2ndFactor = (num1st % num2nd == 0);
        boolean num3rdFactor = (num1st % num3rd == 0);

        if (num2ndFactor && num3rdFactor) {
            System.out.println(num1st + " is a factor of " + num2nd + " and " + num3rd + ".");
        } else if (num2ndFactor) {
            System.out.println(num2nd + " is a factor of " + num1st);
        } else if (num3rdFactor) {
            System.out.println(num3rd + " is a factor of " + num1st);
        } else {
            System.out.println(num1st + " is neither a factor of " + num2nd + " and " + num3rd + ".");
        }

        //[calculator]

        System.out.print("Enter the first operand: ");
        int operand1 = scan.nextInt();
        System.out.print("Enter the second operand: ");
        int operand2 = scan.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        int answer = 0;
        switch (operator) {
            case '+':
                answer = operand1 + operand2;
                break;
            case '-':
                answer = operand1 - operand2;
                break;
            case '*':
                answer = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    answer = operand1 / operand2;
                }
                break;
        }
        System.out.println("The Answer is: " + answer + ".");

        //[TwelveDaysOfChristmas]

        System.out.print("Enter a day (1-12): ");
        int day = scan.nextInt();

        if (day < 1 || day > 12) {
            System.out.println("Please type the day again. Days should be between 1 & 12 only :)");
        } else {

            switch (day) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a-leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a-milking,");
                case 7:
                    System.out.println("Seven swans a-swimming,");
                case 6:
                    System.out.println("Six geese a-laying,");
                case 5:
                    System.out.println("Five gold rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves,");
                case 1:
                    System.out.println("A partridge in a pear tree.");
                    break;
            }
        }

 // Prompt the user for a string and an integer.
  
        
        System.out.print("Enter a string: ");
        String stringName = scan.next();
        
        scan.nextLine();

        System.out.print("Enter an integer: ");
        int integerNum = scan.nextInt();

        if (integerNum <= 0 || integerNum > stringName.length()) {
            System.out.println("Invalid integer input. Please enter an integer within the valid range.");
        } else {
            System.out.println("Character at position " + integerNum + ": " + stringName.charAt(integerNum - 1));
        }
        
        scan.close();
    }
}
