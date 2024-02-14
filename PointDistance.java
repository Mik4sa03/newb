package lab3;
import java.util.Scanner;
import java.util.Random;

//Zell Madriaga
//CSC110AB 24995
//February 6, 2024

public class PointDistance {
	
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	    
		 double xcoordinate = random.nextDouble() * 100; 
	     double ycoordinate = random.nextDouble() * 100; 
	        
	       
	     double xcoordinate2 = random.nextDouble() * 100; 
	     double ycoordinate2 = random.nextDouble() * 100; 
        
	     double horizontalaxis = xcoordinate2 - xcoordinate;
	     double verticalaxis = ycoordinate2 - ycoordinate;
	        
	     double horizontalsquared = Math.pow(horizontalaxis, 2);
	     double verticalSquared = Math.pow(verticalaxis, 2);
	        
	     double distanceSquared = horizontalsquared + verticalSquared;
	        
	     double distance = Math.sqrt(distanceSquared);
        
	     System.out.println("Point 1: (" + xcoordinate + ", " + ycoordinate + ")");
	     System.out.println("Point 2: (" + xcoordinate2 + ", " + ycoordinate2 + ")");
	     System.out.printf("The distance between the two points is: %.2f\n", distance);
	        
	}

}
