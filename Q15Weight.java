package quiz;

public class Q15Weight {
	
	/* The solution I can provide are:
	 * 1. Define the properties/fields needed
	 * 2. Define the constructor needed
	 * 3. Define the getters and setters needed
	 * 4. Make a function getKilograms to convert pound into kilogram
	 * 5. Make a function getPounds to convert kilogram into pound
	 * 6. Use toString method to return a String from the following format on the paper
	 */
	
	//Properties
	private double p;
	private double kg;
	
	//Constructor
	public Q15Weight(double p, double kg)
	{
		this.p = p;
		this.kg = kg;
	}
	
	//Getters and Setters
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	//Function to convert pound into kilogram
	public static String getKilograms (double p)
	{
		double resultKilograms = p*0.45359237;
		return p + " pounds : " + resultKilograms  + " kilograms";
	}
	
	//Function to convert kilogram into pound
	public static String getPounds(double kg)
	{
		double resultPounds = kg/0.45359237;
		return kg + " kilograms : " + resultPounds + " pounds";
	}
	
	//Return from the function getKilograms and getPounds
	public String toString()
	{
		return getKilograms(p)+"\n"+ getPounds(kg);	
	}
	
}
