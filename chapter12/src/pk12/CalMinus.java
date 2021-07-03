package pk12;

public class CalMinus extends CalculatorExam{

	@Override
	public int getResult(int n1, int n2) {
		int n3=0;
		if(n1>=n2) {
			n3=n1-n2;
		}else if(n2>n1) {
			n3=n2-n1;
		}
		
		return n3;
	}

	
	
}
