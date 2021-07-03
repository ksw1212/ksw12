package pk11;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void Hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다.");
	}
}
public class AnimalTest2 {
	ArrayList<Animal> aList = new ArrayList<Animal>();
		
	public static void main(String[] args) {
		AnimalTest2 aTest= new AnimalTest2();
		aTest.addAnimal();
		aTest.testCasting();

	}
	public void addAnimal() {
		aList.add(new Human());
		aList.add(new Tiger());
		aList.add(new Eagle());
		//Animal ani1=new Human; 자동형변환
		for(Animal a : aList) {
			a.move();
		}
	}
	public void testCasting() {
		for(int i=0;i<aList.size();i++) {
			Animal a = aList.get(i);
			
			if(a instanceof Human) {
				Human h = (Human)a;
				h.readBook();
			}else if(a instanceof Tiger) {
				Tiger t = (Tiger)a;
				t.Hunting();	
			}else if(a instanceof Eagle){
				Eagle e = (Eagle)a;
				e.flying();
			}else{
				System.out.println("");
			}
	}

}
}
