package pk6;

public class ArraySum01 {

	public static void main(String[] args) {
		
		int score[] = {83, 90, 87};
		
		System.out.println("score[0]: " +score[0]);
		System.out.println("score[1]: " +score[1]);
		System.out.println("score[2]: " +score[2]);
		
		int sum = 0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
			System.out.println(sum);
		}
		double avg = (double)sum/score.length;
		//String.format : 문자열 형식
		System.out.println(String.format("평균 : %.2f",avg) );
		System.out.println("평균 : " + Math.round(avg));
	}

}
