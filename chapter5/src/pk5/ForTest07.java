package pk5;

public class ForTest07 {

	public static void main(String[] args) {
		//continue
		int i;
		int sum=0;
		for(i=0;i<=100;i++) {
			//짝수 제외하고 더하기
			if(i%2 == 0)
			continue;//if문이 true 일때 실행
			
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
