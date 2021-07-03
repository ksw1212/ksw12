package pk13;

public class PhoneExample {

	
	
	
	
	public static void main(String[] args) {
	//추상클래스는 heap메모리를 사용할수없다.
	//Phone phone = new Phone(); (X)
	SmartPhone smartphone = new SmartPhone("홍길동");
	smartphone.turnOn();
	smartphone.turnOff();
	smartphone.internetSearch();

	}

}
