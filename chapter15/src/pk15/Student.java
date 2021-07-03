package pk15;

public class Student {

	int studentid;
	String studentName;
	public Student(int a, String b) {
		studentid =a ;
		studentName=b;
	
	}

	@Override
	public String toString() {
	return studentid + ", " + studentName;
	}

	@Override
	public int hashCode() {
	
	return studentid;
	}
	@Override//다운캐스팅
	public boolean equals(Object obj) {//equals(Student studentid)
		if(obj instanceof Student) {
		Student std = (Student)obj;
		//database에 있는 값(studentid)와 현재 로그인을 위해 입력한값이 같나
			if(studentid == std.studentid)
				return true;
			else return false;
		}
		return false;
	}
}
