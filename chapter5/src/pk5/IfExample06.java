package pk5;

public class IfExample06 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*6)+1;
		//double num1 = (Math.random()*6); 실수인 숫자가 랜덤으로 추출
		
		if(num==1) {
			System.out.println("1번 획득");
		}else if(num==2) {
			System.out.println("2번 획득");
		}else if(num==3) {
			System.out.println("3번 획득");
		}else if(num==4) {
			System.out.println("4번 획득");
		}else if(num==5) {
			System.out.println("5번 획득");
		}else {
			System.out.println("6번 획득");
		}
	}

}
