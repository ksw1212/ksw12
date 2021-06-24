package pk5;

public class ForTest08 {

	public static void main(String[] args) {
		
		int i,j;
		int a=0;
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				a=i*j;
				System.out.print(j + " ");
				System.out.println(a);
			}
			System.out.println("============");
		}
	}

}
