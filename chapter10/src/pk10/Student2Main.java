package pk10;

public class Student2Main {

	public static void main(String[] args) {
		Student2 a =new Student2();
		a.setStudentName("이강인");
		System.out.println(a.getStudentName()+"의 학번 : "+ a.studentId);
		
		Student2 b =new Student2();
		b.setStudentName("김덕배");
		System.out.println(b.getStudentName()+"의 학번 : "+ b.studentId);
		

	}

}
