// The public class and main is declared
public class School
{
   public static void main (String [] args)
   {
	   // This instantiates instances of the object type: Teacher
	   Teacher kate = new Teacher("Kate Bold", 47, 3, "English", "BEd UWC");
	   Teacher nancy = new Teacher("Nancy Drew", 29 , 7, "Maths", "BSc CPUT");
	   Teacher mike = new Teacher("Mike Michell", 35, 5, "Technology", "BSc US");
      
	   // This prints out the relevant information
	   System.out.println("Teachers\n");
	   System.out.println(kate + "\n");
	   System.out.println(nancy + "\n");
	   System.out.println(mike);
      
	   // This instantiates instances of the object type: Secretary
	   Secretary bill = new Secretary("Bill Scott", 26, 5000, "Admissions", "B Admin CPUT");
	   Secretary fiona = new Secretary("Fiona West", 40 , 15000, "Staff", "B Admin CPUT");
	   Secretary hannah = new Secretary("Hannah Knight", 41, 15000, "Property", "BComm NMMU");
      
	   // This prints out the relevant information
	   System.out.println("\nSecretaries\n");
	   System.out.println(bill + "\n");
	   System.out.println(fiona + "\n");
	   System.out.println(hannah);
      
	   // This instantiates instances of the object type: Student
	   Student sam = new Student("Sam Smith", 13, 7, 'A');
	   Student josh = new Student("Josh Hall", 11, 5, 'D');
	   Student sally = new Student("Sally Gregory", 12, 6, 'C');
      
	   // This prints out the relevant information
	   System.out.println("\nSecretaries\n");
	   System.out.println(sam + "\n");
	   System.out.println(josh + "\n");
	   System.out.println(sally);
   }
}