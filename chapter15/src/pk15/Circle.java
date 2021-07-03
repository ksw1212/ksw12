package pk15;
//복제는 private에 위배되므로 반드시 복제권한Cloneable를 선언
public class Circle implements Cloneable{

	Point point;
	int radius;
	public Circle(int x, int y, int radius) {
		//Point클래스의 객체생성 Point point= new Point();
		point=new Point(x, y);
		this.radius=radius;
		
	}
	@Override
	public String toString() {
		
		return "원점은 " + point + "이고 " + "반지름은 " + radius + "이다" ;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
}
