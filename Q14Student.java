package quiz;

public class Q14Student {
	
	/* The solution I can provide are:
	 * 1. Define the properties/fields needed
	 * 2. Define the constructor needed
	 * 3. Define the getters and setters needed
	 * 4. Use toString method to return a String from the following format on the paper
	 */
	
	//Properties
	private String name;
	private String ID;
	private String Degree;
	
	//Constructor
	public Q14Student(String name, String ID, String Degree)
	{
		this.name = name;
		this.ID = ID;
		this.Degree = Degree;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}
	//Method to return a String from the following format on the paper
	public String toString()
	{
		return "[" + getName() + ", " + "ID: " + getID() + ", " + "Bachelor " + getDegree() + "]";
	}

}
