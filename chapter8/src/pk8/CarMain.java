package pk8;

public class CarMain {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.company);
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);
		System.out.println("현재속도 : "+c.speed);
		System.out.println("===솓고변경 후 출력===");
		c.speed = 60;
		System.out.println("수정된 속도: " + c.speed);

	}

}
