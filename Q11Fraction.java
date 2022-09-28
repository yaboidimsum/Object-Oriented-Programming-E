package quiz;
import java.util.Scanner;


public class Q11Fraction {
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Declaring int ee1 and ee2 as an integer. dd1 and dd2 as a positive integer for values
	 * 3. Create a function findSum to search for the sum and findProduct to look for the result 
	 *    of multiplication
	 * 4. Every value of d1 and d2 on the function is an absolute value, because the question is
	 *    asking for d1 and d2 as a positive integers
	 * 5. findSum contains equations for the upside of fraction(es) and downside of fraction(ds) 
	 * 6. findsum return the value of sum. es/ds
	 * 7. findProduct contains equations for the upside of fraction(ep) and downside of fraction(dp)
	 * 8. findProduct return the value of multiplication. ep/dp
	 */
	
	public static String findSum(int e1,int e2, int d1, int d2)
	{
		int es,ds;
		
		if (d1 == d2)
		{
			es = e1+e2;
			ds = Math.abs(d1);
			
			return "Sum: "+ es + "/" + ds;
		}
		else {
		es = (e1*Math.abs(d2) + e2*Math.abs(d1)); //equation to find upside(es) of fraction in sum
		ds = Math.abs(d1*d2); //equation to find downside(ds) of fraction in sum
		
		return "Sum: "+ es + "/" + ds;
		}
	}
	
	public static String findProduct(int e1,int e2, int d1, int d2)
	{
		int ep, dp;
		
		ep = (e1*e2); //equation to find upside(ep) of fraction in product
		dp = Math.abs(d1*d2); //equation to find downside(dp) of fraction in product
		return "Product: "+ ep + "/" + dp;
	}
	//Notice we use Math.abs for both d1 and d2 to keep the rule of positive integers
	
	

	public static void main (String[] args)
	{
		
		int ee1,ee2,dd1,dd2;
		
		//Scanner for user input
		Scanner scanner = new Scanner(System.in);	
		
		//Print example of task in the given paper
		System.out.println("Test in the task: ");
		System.out.println(findSum(1,1,2,3));
		System.out.println(findProduct(1,1,2,3));
		System.out.println(findSum(1,3,3,4));
		System.out.println(findProduct(1,2,2,3));
		System.out.println(findProduct(1,2,4,3)+ "\n"); //"\n" for a space under
		
		//User can try to put their own input, especially for dd1 and dd2
		// if they put negative values, it won't happened
		System.out.println("Try your input");
		System.out.println("e1 input: ");
		ee1 = scanner.nextInt();
		System.out.println("e2 input: ");
		ee2 = scanner.nextInt();
		System.out.println("d1 input: ");
		dd1 = scanner.nextInt();
		System.out.println("d2 input: ");
		dd2 = scanner.nextInt();
		
		//Call the 2 function and give output of user input
		System.out.println(findSum(ee1,ee2,dd1,dd2));
		System.out.println(findProduct(ee1,ee2,dd1,dd2));
		
		

	}
}
	

