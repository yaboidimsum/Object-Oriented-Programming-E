package quiz;
import java.util.Scanner;


public class Q13ComputerAccount {
	
	/* The solution I can provide are:
	 * 1. Define the properties/fields needed
	 * 2. Define the constructor needed
	 * 3. Define the getters and setters needed
	 * 4. Make a void function changePassword to change the password
	 * 5. Use to string to return the value of real name, username, and password
	 */
	
	//Properties
	private String realName;
	private String userName;
	private String password;

	//Constructor
	public Q13ComputerAccount(String realName, String userName, String password)
	{	
		this.realName = realName;
		this.userName = userName;
		this.password = password;
		
	}

	//Getters and Setters
	public String printRealName()
	{
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String printUserName()
	{
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String printPassword()
	{
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Method to change password
	public void changePassword()
	{
		String newPassword = "callmeawan";
		password = newPassword;
		this.password = password;
	}
	//ToString to print the output
	public String toString()
	{
		return "Name: " + printRealName() +"\n" +"Username: " + printUserName() + "\n" + "Password: " + printPassword();
	}


}
