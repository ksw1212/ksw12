package pk15;

public class IntegerTest {

	public IntegerTest(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
		 Integer i = new Integer(100);//사용권장하지 않음 
		 Integer num = 100; 
		 int iNum =num.intValue(); 
		 int jNum = 200; int sum = iNum +jNum;
		 System.out.println(iNum); System.out.println(sum); 
		 int total =num+jNum;//num.inValue로 변환
		 
		 //Boxing == AutoBoxing Integer i = jNum;
		 
	}

}
