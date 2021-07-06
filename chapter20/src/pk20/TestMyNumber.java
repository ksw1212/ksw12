package pk20;

public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max=(x,y)-> (x>=y)? x:y;
		
		System.out.println(max.getMax(10,20));
		
		/*
		 * int i =10000;
		 * 
		 * MyNumber aa = new MyNumber() { //i=1000; //생존 주기가 더 길수도 있기 때문에 사용 안됨
		 * 
		 * @Override public int getMax(int num1, int num2) { int res=(num1>=num2)? num1:num2; return res; } };
		 */
	}

}
