package pk5;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int i=1;
		int j=0;
		do {//do ~ while문의 헤더
			j +=i;//1
			i++;//2 인덱스변수 증가
		}while(i<=10);//do ~ while문 조건비교해서 닫기
		System.out.println(j);
	}

}
