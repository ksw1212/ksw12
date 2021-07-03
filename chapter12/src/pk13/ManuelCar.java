package pk13;

public class ManuelCar extends Car{

	@Override
	public void drive() {
		System.out.println("악셀을 밟습니다.");
		
	}

	@Override
	public void stop() {
		
		System.out.println("브레이크를 밟습니다.");
	}
	
}
