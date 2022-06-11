import java.util.Scanner;
public class postgraduate extends Student {
	public static void main(String[] args) {
		postgraduate USIM = new postgraduate();
		postgraduate printCgpa = new postgraduate();
		postgraduate displayId = new postgraduate();
		 String program = "Computer Science";
		 String specialization = "CyberSecurity";
		 Scanner input = new Scanner (System.in);

		 System.out.print("Please insert your studentID: ");
		 
		 int studentID = input.nextInt();
			 if (studentID == USIM.setstudentID()) {
				 System.out.println("Postgraduate Student Info");
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
	
	postgraduate USIM = new postgraduate();
	USIM.setcurrentCGPA();
	System.out.println("CGPA:\t"+USIM.getcurrentCGPA());
}

public void displayID() {
	postgraduate USIM = new postgraduate();
	
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