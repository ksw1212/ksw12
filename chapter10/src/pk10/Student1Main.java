package pk10;

public class Student1Main {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이승우");
		System.out.println(studentLee.serialNum);
		Student1.serialNum++;
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김덕배");
		Student1.getSerialNum();
		System.out.println(studentKim.serialNum);
		Student1.serialNum++;
		

	}

}
