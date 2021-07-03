package pk6;

public class ArayTest01 extends AgresTest {

	public static void main(String[] args) {
		/*배열 선언
		  int [] number1=new int [10];
		  int number2[] =new int [10];
		  int number3[];
		  number3 = new int[10];
		 */
		/*초기화
		  	int[] number1 = new int[] {1,2,3,4,5,6,7,8,9,10}
		 */
		/*
		 * int [] number1 = new int[] {1,2,3,4,5,6,7,8,9,10}; //int [] number1 = new
		 * int[10] {1,2,3,4,5,6,7,8,9,10};//오류 int number3[] =
		 * {1,2,3,4,5,6,7,8,9,10};//가장 많이 사용하는 방법 
		 * int[] number4 =  {1,2,3,4,5,6,7,8,9,10};//가장 많이 사용하는 방법
		 */	
		int i;
		int number[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(i=0;i<=number.length;i++) {
			System.out.println(number[i]);
			
		}
	}
}
