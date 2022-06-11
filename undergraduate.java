import java.util.*;
public class undergraduate extends Student {

	public static void main(String[] args) {
	
		undergraduate USIM = new undergraduate();
		undergraduate printCgpa = new undergraduate();
		undergraduate displayId = new undergraduate();
		 String program = "Computer Science";
		 String specialization = "Information security and assurance";
		 Scanner input = new Scanner (System.in);

		 System.out.print("Please insert your studentID: ");
		 
		 int studentID = input.nextInt();
		 
			 if (studentID == USIM.setstudentID()) {
				 System.out.println("Undergraduate Student Info");
				 System.out.println("\nProgram: "+ program);
				 System.out.println("Major: "+ specialization);
				 displayId.displayID();
				 printCgpa.printCGPA();	 	
		 } 
			 else {
				 System.out.println("This ID "+ "is not valid");
			 }
			 input.close();
	}
	public void printCGPA() {
		undergraduate USIM = new undergraduate();
	
		USIM.setcurrentCGPA();
		System.out.println("CGPA:\t"+USIM.getcurrentCGPA());
	}
	public void displayID() {
		undergraduate USIM = new undergraduate();
		
		USIM.setstudentName();
		System.out.println("Name: " + USIM.getstudentName());
		
		USIM.setstudentID();
		System.out.println("Student Id: " + USIM.getstudentID());
		
		USIM.setphoneNumber();
		System.out.println("No phone: " + USIM.getphoneNumber());
		
		USIM.setaddress();
		System.out.println("Address: " + USIM.getaddress());	
	}
}
