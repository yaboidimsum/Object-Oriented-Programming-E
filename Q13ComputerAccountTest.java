package quiz;


public class Q13ComputerAccountTest {

	/* The solution I can provide are:
	 * 1. Make the class Q13ComputerAccount and the specific object mahasiswa1
	 * 2. Send the arguments to constructor in Q13ComputerAccount.java
	 * 3. Print out the object.toString to see the result
	 * 4. Call the changePassword function to change the password
	 * 5. Print out the object.toString again to see if the password changes
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("Test in the task");
		
		//Send the arguments to Q13ComputerAccount in Constructor
		Q13ComputerAccount mahasiswa1 = new Q13ComputerAccount("Dimas Prihady S.","yaboidimsum","itsmedimsum");
		
		//Call the information in mahasiswa1 to toString
		System.out.println(mahasiswa1.toString());
		
		//Call to change the password
		mahasiswa1.changePassword();
		
		System.out.println("\n");
		
		//Check if the password has change
		System.out.println(mahasiswa1.toString());
	}
	
}
