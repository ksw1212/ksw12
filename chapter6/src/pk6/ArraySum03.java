package pk6;

public class ArraySum03 {

	public static void main(String[] args) {
		int score[];
		score = new int[]  {83,90,87};
		/*
		 * int sum = 0; for(int i = 0; i<score.length;i++) { sum+=score[i]; }
		 * System.out.println(sum);
		 */
		int sum2= add(new int[] {83,90,87});
		System.out.println("총합 : "+sum2);
		System.out.println();
			
			System.out.println(add(score));
	 	}
	//매개변수 : 메소드 컴파일시 사용되는 변수
	public static int add(int score[]) {
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		return sum;
	}
}
