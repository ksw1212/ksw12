package pk12;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();//이륙
		sa.fly();//비행
		sa.flyMode++;//초음속비행
		sa.fly();
		sa.flyMode--;//비행
		sa.fly();
		sa.land();//착륙
	}
}
