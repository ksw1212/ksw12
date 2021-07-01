package pk16;

public class AnonyInter {

	public void test() {
		//클래스 정의가 생략
		new TestInter() {
			@Override
			public void printData() {
				System.out.println("익명의 클래스");
			}
		}.printData();//인터페이스 클래스이므로 재구현
	}
	
	public static void main(String[] args) {
		AnonyInter ai = new AnonyInter();
		ai.test();

	}

}
