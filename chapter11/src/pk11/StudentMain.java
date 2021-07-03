package pk11;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student("홍길동", "123456-1234567", 1);
		System.out.println(st.name);
		System.out.println(st.ssn);
		System.out.println(st.studentNum);

	}

}
