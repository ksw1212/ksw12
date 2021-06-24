package pk3;

public class Constant {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값 선언
		final int Max_NUM = 100;
		final int Min_NUM;
		//final double PI= 3.14;
		Min_NUM = 0;
		
		System.out.println(Max_NUM);
		System.out.println(Min_NUM);
		
		/*
		 * Max_NUM=1000; Error:상수값 즉 한번 선언하면 변경 불가 PI=31.4
		 */
	}

}
