package pk11;

public class Car {

	public int speed;
	
	public void speedup() {
		speed+=1;
	}
	public final void stop() {
		System.out.println("자동차가 멈춤니다.");
		speed=0;
	}
}
