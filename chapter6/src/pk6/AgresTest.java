package pk6;

public class AgresTest {

	public static void main(String[] args) {
		//초기화
		//int a[]= new int[5];
		//int[] a;
		//a = new int[5];
		
		/*
		 * args = new String[2]; 메모리
		 *  args[0] = "1"; args[1] = "2";
		
		 */		
		int aVal;
		int bVal;
		
		int Tot;
		
		if(args.length==2) {
			//String ->int parseint
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
			
		}//true
		else {
			aVal=0;
			bVal=0;

		}//false
		Tot=aVal + bVal  ;
		System.out.println(Tot);
	}

}
