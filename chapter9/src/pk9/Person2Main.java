package pk9;

public class Person2Main {

	public static void main(String[] args) {
		/* Person2 person = new Person2(); */
		//김유신 몸무게85.5 키 185.0
		/*
		 * person.name="김유신"; person.heigh=85.5f; person.weigh=185.0f
		 */;
		 Person2 person = new Person2("김유신", 185.5f, 85.5f);
		System.out.println(person.name);
		System.out.println(person.heigh);
		System.out.println(person.weigh);
	}

}
