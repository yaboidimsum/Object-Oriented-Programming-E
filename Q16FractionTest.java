package quiz;
import java.util.Scanner;

public class Q16FractionTest {
	
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Make the class Q16Fraction and the specific object f1 and f2
	 * 3. Send the arguments to constructor in Q16Fraction.java
	 * 4. The calculation of fraction happen in Q16Fraction.java
	 * 5. Print out the object.toString to see the result
	 * 6. User can try their own input by entering the numerator and denominator
	 * 7. Make the class Q16Fraction and the specific object f3 and f4
	 * 8. Send the arguments to constructor in Q16Fraction.java
	 * 9. The calculation of fraction happen in Q16Fraction.java
	 * 10. Print out the object.toString to see the result
	 */
	
	public static void main ( String[] args) {
	
	int e1,d1,e2,d2;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Test in the task");	
	//Send the arguments to Q16Fraction in Constructor
	Q16Fraction f1 = new Q16Fraction(1,2);
	Q16Fraction f2 = new Q16Fraction(3,7);
	
	//Print out the fraction of f1 and f2
	System.out.println("f1: "+ f1.toString());
	System.out.println("f2: "+ f2.toString());
	
	//Print out the product and sum from function getProduct and getSum in Q16Fraction.java
	System.out.println("Product: "+ f2.getProduct(f1));
	System.out.println("Sum: "+ f2.getSum(f1) + "\n");
	
	System.out.println("Try your input");
	
	//User input for numerator and denominator
	System.out.println("Enter numerator 1: ");
	e1 = scanner.nextInt();
	System.out.println("Enter denominator 1: ");
	d1 = scanner.nextInt();
	System.out.println("Enter numerator 2: ");
	e2 = scanner.nextInt();
	System.out.println("Enter denominator 2: ");
	d2 = scanner.nextInt();
	
	//Send the arguments to Q16Fraction in Constructor
	Q16Fraction f3 = new Q16Fraction(e1,d1);
	Q16Fraction f4 = new Q16Fraction(e2,d2);
	
	//Print out the product and sum from function getProduct and getSum in Q16Fraction.java
	System.out.println("f3: "+ f1.toString());
	System.out.println("f4: "+ f2.toString());
	System.out.println("Product: "+ f3.getProduct(f4));
	System.out.println("Sum: "+ f3.getSum(f4));
	
	
	}
	

}
