package pk9;

public class Overload {
	
	private int age;
	private float heigh;
	private String name;
	
	public Overload() {
		age =0;
		heigh =0.0f;
		name = "익명";
	}
	//나이 키
	Overload(int age,float heigh){
		this.age=age;
		this.heigh=heigh;
	}
	//나이 키 이름
	Overload(int age, float heigh, String name){
		this.age=age;
		this.heigh=heigh;
		this.name=name;
	}
	//Disp
	public void Disp(){
		System.out.println(this.age);
		System.out.println(this.heigh);
		System.out.println(this.name);
	}
}
