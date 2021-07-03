package pk8;

public class StudentMain {

	public static void main(String[] args) {
		Student ST = new Student();
		//필드를 사용하여 이름과 주소출력
		System.out.println("-----필드 이용-----");
		ST.studentName="홍길동";
		ST.address = "율도국";
		ST.showStudnetInfo();
		
		//메서드를 사용하여 이름과 주소 출력
		System.out.println("-----메서드 이용-----");
		ST.setAddress("황해도");
		ST.setStudentName("임꺽정");
		ST.showStudnetInfo();
	}

}
