package quiz;
import java.util.Scanner;

public class Jokes {
	
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Declaring joke_string as a string
	 * 3. Create a function is_funny, if length < 20 it's funny, else it's not funny
	 * 4. Create a function first_word, to take the first word of string and print it out
	 
	 */

	private static String joke_string;
	
	//Function to determine if a joke is funny or not
	//If the length of the joke is < 20, it's funny. Otherwise, it is not funny
	public static void is_funny()
	{
		if (joke_string.length()<20)
		{
			System.out.println("It's funny");
		}
		else
		{
			System.out.println("It's not funny");
		}
	}
	
	//Function to get the first word of the joke, separated by space
	//Use for loop with string length and charAt blank space to find the first word
	public static void first_word()
	{
		String result = joke_string;
		for(int i = 0; i < joke_string.length(); i++)
		{
			if (joke_string.charAt(i) == ' ')
			{
				result = joke_string.substring(0, i);
	            break;
			}
		}
		System.out.println(result);
	}
	
	//To test the program
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Test in the task");
		
		joke_string = "Knock knock who's there?";
		is_funny();
		first_word();
		joke_string = "Your life";
		is_funny();
		first_word();
		
		System.out.println();
		System.out.println("Try your input");
		joke_string = scanner.nextLine();
		is_funny();
		first_word();
	}
	
	
	
}
