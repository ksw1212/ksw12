package pk3;

public class variable1 {
	
	int avar=10;//어느 블록에서도 사용가능한 전역변수
	
	public static void main(String[] args) {
		int level;//정수형 변수선언(level)
		level=10; //level변수에 10을 대입
		//level은 main블록안에서만 사용가능한 지역변수
		
		System.out.println(level);

	}

}
