package pk17;

public class Person {

	private String name;
	private int age;
	
	//기본
	public Person() {}
	//String name
	public Person(String name) {
		this.name=name;
	}
	//String name, int age
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//@Override//toString 해시코드를 주지만 오버라이딩해서 내용을 반환하게 한다.
	/*public String toString() {
		// TODO Auto-generated method stub
		return name;
	}*/
	
	
}
