package pk11;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("draw Shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("draw Circle");
	}
	void circle() {
		System.out.println("원모양 입니다.");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("draw Rectangle");
	}
	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("draw Triangle");
	}
	void triangle() {
		System.out.println("삼각형 입니다..");
	}
}


public class ShapeTest{
	//Shape를 기준으로 Shape 클래스와 Shape를 상속받은 모든 클래스
	//Circle ???;
	
	ArrayList<Shape> sList =new ArrayList<Shape>();
	 
	
	public static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		System.out.println("----업캐스팅----");
		sTest.addShape();
		System.out.println("---다운캐스팅---");
		sTest.testCasting();
	}
	public void addShape() {
		sList.add(new Circle()); //Circle lang = new Circle()
		sList.add(new Rectangle());//Rectangle lang = new Rectangle()
		sList.add(new Triangle()); //Triangle lang = new Triangle()
		//업캐스팅
		//overriding된 메서드이므로 자식클래스의 draw로 컴파일됨
		for(Shape s : sList) {
			s.draw();
		}
	
	}
	Circle c = new Circle();
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s = sList.get(i);
			
			if(s instanceof Circle) {
				Circle c = (Circle)s;
				c.circle();
			}else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.rectangle();	
			}else if(s instanceof Triangle){
				Triangle t = (Triangle)s;
				t.triangle();
			}else{
				System.out.println("");
			}
		}
		
	}

}
