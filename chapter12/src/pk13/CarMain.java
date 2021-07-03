package pk13;

public class CarMain {

	public static void car(Car car) {
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
	}
	
	public static void main(String[] args) {
		
		car(new AICar());
		car(new ManuelCar());
	}

}
