package pk5;

public class SwitchCase07 {

	public static void main(String[] args) {
		
		int time;
		time = (int)(Math.random()*4)+9;//Math.random의 기본 타입은 double임으로 int로 형변환이 필수
		System.out.println("현재시간" + time);
		switch(time) {
		case 9:
			System.out.println("출근합니다.");break;
		case 10:
			System.out.println("커피를 마쉬고 쉽니다.");break;
		case 11:
			System.out.println("점심을 먹습니다.");break;
		default:
			System.out.println("탄력근무를 합니다.");
			
		}
		

	}

}
