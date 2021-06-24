package pk5;

public class ForTest09 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=10; i++) {	
			
			for(j=1; j<=10; j++) {
				if(4*i + 5*j ==60) {
					System.out.println("(" +i+ ","+j+")");
				}
			}
		}
	}
}


