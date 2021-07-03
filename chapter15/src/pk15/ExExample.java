package pk15;

public class ExExample {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i);
				//break;
			}
		}
		System.out.println("END!!");
		//system.exit로 탈출을 했을 경우에는 컴파일 되지 않는 부분
	}

}
