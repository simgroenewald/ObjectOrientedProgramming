// The class Teacher is created
public class Teacher {	
	
	// Attributes 
	// Here all the attributes for the object is declared
	String name;
	int age;
	int grade;
	String subject;
	String qualification;
	
	// Methods
	// Constructor - This is needed to create a new object and initialize the attributes
	public Teacher(String name, int age, int grade, String subject,
			String qualification) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.subject = subject;
		this.qualification = qualification;				
	}
	
	// Declares the toString 
	// This is used to display the contents of each variable 
	public String toString() {
		String output = "Name: " + name;
		output += "\nAge: " + age;
		output += "\nGrade: " + grade;
		output += "\nSubject: " + subject;
		output += "\nQualification: " + qualification;
		
		return output;
	}
}


