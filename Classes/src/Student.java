// The class Student is created
public class Student {
	
	// Attributes
	// Here all the attributes for the object is declared
	String name;
	int age;
	int grade;
	char registrationClass;
		
	// Methods
	// Constructor - This is needed to create a new object and initialize the attributes
	public Student(String name, int age, int grade, char registrationClass) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.registrationClass = registrationClass;
	}
	
	// Declares the toString 
	// This is used to display the contents of each variable 
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge:" + age;
		output += "\nGrade:" + grade;
		output += "\nRegistration class:" + registrationClass;
	   
		return output;
	}

}

