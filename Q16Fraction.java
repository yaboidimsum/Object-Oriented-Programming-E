package quiz;

public class Q16Fraction {
	
	/* The solution I can provide are:
	 * 1. Define the properties/fields needed
	 * 2. Define the constructor needed
	 * 3. Define the getters and setters needed
	 * 4. Make a getSum and getProduct function to find the sum and product
	 * 5. Use Q16Fraction test in getSum and getProduct parameter to take the second input
	 * 6. Use toString method to return the fraction of f1 and f2
	 */
	
	//Properties
	private int numerator;
	private int denominator;
	
	//Constructor
	public Q16Fraction (int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//Getters and Setters
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	//Function getSum and getProduct to find the Sum and Product of two input
	//Use the Q16Fraction test for the second input. All numerator and denominator that have test.
	//are input from second input(f2 and f4 in this case)
	public String getSum(Q16Fraction test) 
	{									   
		int es,ds;                         
		if(denominator == test.denominator)
		{
			es = numerator+test.numerator;
			ds = denominator;
		}
		else
		{
			es = (numerator*test.denominator)+(test.numerator*denominator);
			ds = denominator*test.denominator;
		}
		return es + "/" + ds;		
	}
	public String getProduct(Q16Fraction test)
	{
		int ep = numerator*test.numerator;
		int dp = denominator*test.denominator;
		return ep + "/" + dp;
	}
	//Return the fraction of f1 and f2
	public String toString()
	{
		return numerator + "/"+ denominator;	
	}
}
