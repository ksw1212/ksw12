package pk9;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age=age;
	}
	Person returnSelf() {
		return this;
	}
	
	
	
	public static void main(String[] args) {
		Person noName =new Person();
		Person name =new Person("김승우", 27);
		//오버로딩생성자 객체
		System.out.println(name.name);
		System.out.println(name.age);
		//기본생성자 객체
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println(noName.returnSelf());
		
	}

}
