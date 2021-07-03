package pk8;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	//생성자(기본생성자) : free compile
	
	//메서드
	public void showStudnetInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
