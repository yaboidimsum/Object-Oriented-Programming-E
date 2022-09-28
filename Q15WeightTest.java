package quiz;
import java.util.Scanner;

public class Q15WeightTest {
	
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Make the class Q15Weight and the specific object firstTest
	 * 3. Send the arguments to constructor in Q15Weight.java
	 * 4. The conversion happen in Q15Weight.java
	 * 4. Print out the object.toString to see the result
	 * 5. User can try their own input by entering the value double of pound and kilogram
	 * 6. Make the class Q15Weight and the specific object secondTest
	 * 7. Send the arguments to constructor in Q15Weight.java
	 * 8. Print out the user input with the same method of object.toString
	 */

	public static void main(String[] args) 
	{
		double pound,kilogram;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Test in the task");
		//Send the arguments to Q15Weight in Constructor
		Q15Weight firstTest = new Q15Weight (1, 0.45359237);
		//Print out the firstTest containing convertion of pound and kilogram
		System.out.println(firstTest.toString()+"\n");
		
		System.out.println("Try your input");
		
		//User input for pound and kilogram
		System.out.println("Pound: ");
		pound = scanner.nextDouble();
		System.out.println("Kilogram: ");
		kilogram = scanner.nextDouble();
		
		//Send the arguments to Q15Weight in Constructor
		Q15Weight secondTest = new Q15Weight (pound, kilogram);
		//Print out the secondTest containing convertion of pound and kilogram
		System.out.println(secondTest.toString());
		
		
	}
	
}
