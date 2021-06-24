package pk5;

public class ForTest06 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		/*
		 * for(i=1;i<100;i++) { sum+=i; if(sum>=100)
		 * 
		 * break;
		 * 
		 * 
		 * }
		 */		
		for(i=1;i<=100;i++) {
			sum+=i;
			if(sum<100)
				System.out.println(sum);
			
		}
				System.out.println(i);
				System.out.print(sum+" ");
	}
}
