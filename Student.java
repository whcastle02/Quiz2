
public class Student {

	private String studentName, phoneNumber, address, currentCGPA;
	private int studentID;
	
	public String setstudentName() {
		
		String StudentName = "MUHAMMAD DANISH HAZIMI BIN ZAHARUDDIN";
		return this.studentName = StudentName;
	}
	public String getstudentName() {
		return this.studentName;
	}
	
	public int setstudentID() {
		
		int StudentID = 1211162;
		return this.studentID = StudentID;
	}
	public int getstudentID() {
		return this.studentID;
	}
	
	public String setphoneNumber() {
		
		String PhoneNumber = "013-471-3721";
		return this.phoneNumber = PhoneNumber;
	}
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	
	public String setaddress() {
		
		String Address = "Kolej Kediaman 1, Universiti Sains Islam Malaysia,\n\t 71800, Nilai, Negeri Sembilan";
		return this.address = Address;
	}
	public String getaddress() {
		return this.address;
	}
	
	public String setcurrentCGPA() {
		
		String CurrentCGPA = "3.51";
		return this.currentCGPA = CurrentCGPA;
	}
	public String getcurrentCGPA() {
		return this.currentCGPA;
	}
}
