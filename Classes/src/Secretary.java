// The class Secretary is created
public class Secretary {
	
	// Attributes of the class
	// Here all the attributes for the object is declared
	String name;
	int age;
	int budget;
	String department;
	String qualification;
		
	// Methods
	// Constructor - This is needed to create a new object and initialize the attributes
	public Secretary(String name, int age, int budget, String department,
			String qualification) {
		this.name = name;
		this.age = age;
		this.budget = budget;
		this.department = department;
		this.qualification = qualification;				
	}
	
	// Declares the toString 
	// This is used to display the contents of each variable 
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		output += "\nBudget: R" + budget;
		output += "\nDepartment: " + department;
		output += "\nQualification: " + qualification;
			
		return output;
	}
}
