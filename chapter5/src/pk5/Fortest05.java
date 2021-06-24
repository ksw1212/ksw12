package pk5;

public class Fortest05 {

	public static void main(String[] args) {
		//1부터 100까지의 합을 구하지만 합이 100에 가장 가까운 시점에서 합과 숫자 출력
		
		int i;
		int sum=0;
			for(i=1;i<100;i++) {
				 sum+=i;
				 if(sum<100) {
					 System.out.println(i);
					 System.out.print(sum+" ");
				 }
				
			}
			/*
			 * for(int i=1;i<=100;i++) { sum+=i; if(sum<100) { System.out.println(sum);
			 * 
			 * 
			 * }
			 */
		
	}

}
