package pk7;

public class FunTest05 {
	
	int value; //멤버변수 a=10 b=20
	
	//오버로딩된 생성자가는 디폴트 생성자가 반드시 명시 되어야 한다.
	public FunTest05() {} //디폴트 생성자
	
	//생성자 : 클래스의 초기화
	//this는 클래스에 있는
	public FunTest05(int value){
		this.value=value;
	}
	
	
	public static void swap(FunTest05 x, FunTest05 y) {
		
		int temp=x.value; 
		x.value=y.value;
		y.value=temp;
		
		System.out.println("swap() 결과 값 : x = " + x.value+ " y = " + y.value );
		
	}
	
	 
	public static void main(String[] args) {
		
		FunTest05 a=new FunTest05(10);
		System.out.println(a);
		FunTest05 b=new FunTest05(20);
		System.out.println(b);
		System.out.println("========================");
		
		 System.out.println("swap() 호출 전 : a = " + a.value + " b = " + b.value
				 );
	     System.out.println("=================");
	     //객체로 접근하여 호출
	     swap(a,b);
	     System.out.println("=================");
	     //heap메모리 참조후 값이므로 바뀜
	     System.out.println("swap() 호출 후 : a = " + a.value+ " b = " + b.value );
		

	}

}
