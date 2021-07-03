package pk13;

public class AnimalExample {
	
	public static void animalsound(Animal animal) {
		
		animal.sound();
	}
	
	public static void main(String[] args) {
		//각각의 객체를 만들어서 Cat과 Dog의 사운드 메서드 호출
		System.out.println("-----각각의 객체 생성-----");
		Cat c = new Cat();
		c.sound();
		System.out.println();
		Dog d = new Dog();
		d.sound();
		System.out.println("-----자동형변환------");
		Animal a = null;//초기화가 안되어있는 상태
		a =new Cat();
		a.sound();
		System.out.println();
		a = new Dog();
		a.sound();
		System.out.println("-----메서드(매개변수) 사용-----");
		animalsound(new Cat());
		System.out.println();
		animalsound(new Dog());
	}//main
	

}
