package pk16;

class Outter2{
	Runnable getRunnable(int i) {
		int num=100;
		
		//클래스명이 생략됨
		//class Inner()
		//익명의 클래스
		return new Runnable() {
			
			@Override
			public void run() {
				//num=200//ERROR
				//i=500;//ERROR
				System.out.println(i);
				System.out.println(num);
				
			}
		};
	}
	Runnable runner= new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 재구현됨 ");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		out.getRunnable(0);
		Runnable runner = out.getRunnable(0);
		runner.run();
		out.runner.run();
	}

}
