import java.util.Scanner;


public class Q11Fraction {
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Declaring int e1 and e2 as an integer. d1 and d2 as a positive integer for values
	 * 3. Declaring sum,product for the final result
	 * 4. Declaring sumUp,sumDown for the upper and lower side sums of the fractions
	 * 	  accompanied by productUp,productDown for the top and bottom side products of multiplication results
	 * 5. Request user input for values e1,e2,d1,d2
	 * 6. sumUp, sumDown, productUp, and productDown have their respective formula functions to calculate
	 * 7. Print out for the top/bottom side of each sum and product.
	 */
	

	public static void main (String[] args)
	{
		int e1,e2;
		int d1,d2;
		int sum,product;
		int sumUp,sumDown,productUp,productDown;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of e1: ");
		e1= scanner.nextInt();
		System.out.println("Enter the value of e2: ");
		e2= scanner.nextInt();
		
		
		do{
			System.out.println("Enter the value of d1: ");
			d1= scanner.nextInt();
		}while(d1<0);
		
		do{
			System.out.println("Enter the value of d2: ");
			d2= scanner.nextInt();
		}while(d2<0);
		
		sumUp = (e1*d2 + e2*d1);
		sumDown = (d1*d2);
		productUp = (e1*e2);
		productDown = (d1*d2);
		
		
		System.out.println("sum: " + sumUp + "/" + sumDown);
		System.out.println("product: " + productUp + "/" + productDown);
		}
	}
	
	
