package pk7;

public class EX1_OverloadingMain {

	public static void main(String[] args) {
		
		//EX1_Overloading의 객체 =>ex
		EX1_Overloading ex=new EX1_Overloading();
		
		ex.getResult('A');
		ex.getResult(10);
		ex.getResult("맛점 하세요!!");
		ex.getResult(10, "맛점 하세요!!");
		

	}

}
