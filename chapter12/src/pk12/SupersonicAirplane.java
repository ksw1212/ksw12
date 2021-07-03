package pk12;

public class SupersonicAirplane extends AirPlane{

	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행을 합니다.");
		}else {
			super.fly();
		}
	}	
}
