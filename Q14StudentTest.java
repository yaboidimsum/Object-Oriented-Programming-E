package quiz;
import java.util.Scanner;

public class Q14StudentTest {
	
	/* The solution I can provide are:
	 * 1. Using import.java.util.scanner for user input
	 * 2. Make the class Q14Student and the specific object firstStudent
	 * 3. Send the arguments to constructor in Q14Student.java
	 * 4. Print out the object.toString to see the result
	 * 5. User can try their own input by entering the name,ID,and bachelor
	 * 6. Make the class Q14firstStudent and the specific object secondStudent
	 * 7. Send the arguments to constructor in Q14Student.java
	 * 8. Print out the user input with the same method of object.toString
	 */
	
	public static void main(String[] args) 
	{
	String name,ID,bachelor;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Test in the task");
	//Send the arguments to Q14Student in Constructor
	Q14Student firstStudent = new Q14Student ("Sri Purwaningsih", "1000001", "Informatics");
	//Print out the firstStudent and specific following format from the paper
	System.out.println(firstStudent.toString()+"\n");
	
	System.out.println("Try your input");
	//User input for name,ID, and bachelor
	System.out.println("Enter name: ");
	name = scanner.nextLine();
	System.out.println("Enter ID: ");
	ID = scanner.nextLine();
	System.out.println("Enter bachelor: ");
	bachelor = scanner.nextLine();
	
	//Send the arguments to Q14Student in Constructor
	Q14Student secondStudent = new Q14Student (name,ID,bachelor);
	//Print out the secondStudent and specific following format from the paper
	System.out.println(secondStudent.toString());
	}
}
