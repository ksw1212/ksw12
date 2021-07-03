package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		
		//로또번호 6개를 담을 배열을 준비.
		int Lotto[]=new int[6];// 0 1 2 3 4 5
		System.out.println("이번주 로또 예상 번호 : ");
		outer : for(int i=0;i<Lotto.length;) {//i++생략 가능함
			
			Lotto[i] = new Random().nextInt(45)+1;
			
			//중복값을 비교하는 반복문 필요
			for(int j=0;j<i;j++) {
				if(Lotto[i]==Lotto[j]) {
					continue outer;
				}
			}
			System.out.print(Lotto[i] + " ");
			i++;
		}

	}

}
