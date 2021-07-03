package pk12;

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorExam cal = new CalculatorExam();
		System.out.println(cal.getResult(1, 1616));
		CalPlus cp = new CalPlus();
		CalMinus cm=new CalMinus();
		System.out.println("CalPlus : "+cp.getResult(15, 15));
		System.out.println("CalMinus : "+cm.getResult(15, 30));
		

	}

}
