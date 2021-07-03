package pk8;

public class MyDateMain {

	public static void main(String[] args) {
		//2021년 6월 17일
		MyDate md = new MyDate();
		md.day = 17;
		md.month = 6;
		md.year = 2021;
		System.out.println(md.year+"년 " + md.month+ "월 "+md.day+ "일");

	}

}
