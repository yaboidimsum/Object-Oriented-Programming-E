package quiz;
import java.util.Scanner;

public class Q12Time {
	
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Declaring int hh and mm as an integer
	 * 3. Create a function findAngle to find the degree between hour and minute
	 * 4. Function findAngle finds the hour's hand and minute's hand, and then calculate into an angle
	 * 5. Function findAngle has 2 cases
	 * 		first case : happen if the minute hand passes the hour hand
	 * 		second case: happen if the minute hand doesn't pass the hour hand
	 */
	
// Function to calculate the angle between the hour and minute hand
public static String findAngle(int hh, int mm)
{
    // handle the 24 hour notation
    hh = hh % 12;

    // find the position of the hour's hand
    int h = (hh * 360) / 12 + (mm * 360) / (12 * 60); //

    // find the position of the minute's hand
    int m = (mm * 360) / (60); //

    // calculate the angle difference, absolute because the degree is not negative
    int angle = Math.abs(h - m);

    // 2 different cases
    // Happen if the minute hand passes the hour hand
    if (m > h) { 
        angle = 360 - angle;
    }
    // else, happen if the minute hand doesn't pass the hour hand
    else
    {
    	return angle + " degree";
    }

    return angle + " degree";
}


public static void main(String[] args)
	{
	int hh;
	int mm;
	
	//Scanner for user input
	Scanner scanner = new Scanner (System.in);
	
	//Print example of task in the given paper
    System.out.println("Test in the task");
	System.out.println(findAngle(9, 00));
    System.out.println(findAngle(3, 00));
    System.out.println(findAngle(18, 00));
    System.out.println(findAngle(1, 00));
    System.out.println(findAngle(2, 30));
    System.out.println(findAngle(4, 41)+ "\n");
    
    //User can try to put their own input
    System.out.println("Try your input");
    System.out.println("Hour input: ");
    hh = scanner.nextInt();
    System.out.println("Minute input: ");
	mm = scanner.nextInt();
	
	//Call the function and give output of user input
	System.out.println(findAngle(hh,mm));

 
	}
}