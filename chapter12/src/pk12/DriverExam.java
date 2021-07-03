package pk12;

import Test.Vehicle;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Taxi());
		driver.driver(new Bus());
		

	}

}
