package pk7;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		try {
			
			System.out.println("fun()메서드");
			throw new Exception();
			
		} catch (RuntimeException e) { //실행중에 발생되는 에러
			System.out.println("예외발생");
			
		}finally { //에러를 잡지 못하더라도
			System.out.println("finally 문장");
		}
	}

	public static void main(String[] args) {
		
	//fun();
		try {
			fun();
		} catch (Exception e) {
			System.err.println("main()의 catch문 문장");
		}

	}//main

}//class
