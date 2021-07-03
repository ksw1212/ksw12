package pk8;

import java.util.Random;

public class Start {
	
	private int random = new Random().nextInt(50)+1;//Cpu
	private int count=0;
	private String result = "FAIL";
	
	public String check(int n) {
		count++;
		StartMain s = new StartMain();
		if(n<random) {
			System.out.println("up");
		}else if(n>random) {
			System.out.println("down");
		}else {
			System.out.println(count + "회 만에 정답!!!");
			result="Success";
			s.run=false;
		}
		
		return result;
	}
	
}
