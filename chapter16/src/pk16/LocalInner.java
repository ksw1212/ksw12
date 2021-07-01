package pk16;


class Outter{
	//외부필드
	int outNum = 100;
	static int sNum=200;
	
	//java.lang.Thread 
	//Runnable는 매개변수(int i)와 지역변수는 final처럼 사용.
	Runnable getRunnable(int i) {
		int num =100;
		
		class myRunnable implements Runnable{
				int localNum=10;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//i  =100;//Runnable이므로 매개변수 역시 상수로 바귐
				System.out.println("i ="+i);
				System.out.println("num ="+num);
				System.out.println("localNum ="+localNum);
				System.out.println(outNum);
				System.out.println(Outter.sNum);
			};//run
			
		}//MyRunnable
		return new myRunnable();
	}
	
}



public class LocalInner {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable run = new Outter().getRunnable(0);
		//Runnable에 getRunnable가 사용했던 매개변수 메서드는 소멸ㅜ
		run.run();
	}

}
