package pk20;

interface PrintString{
	void showString(String str);
}



public class TestLambDa {

	public static void  showMyString(PrintString p) {
		p.showString("Hell Lambda");
	}
	public static PrintString returnString() {
		return s->System.out.println(s+"world");
	}
	
	public static void main(String[] args) {
		//람다
		
		PrintString ps =(s) -> System.out.println(s);
		ps.showString("Hello Lambda");
		//메서드
		showMyString(ps);
		//lambda+method
		PrintString reStr= returnString();
		reStr.showString("Hyundai Venu2022");
		
		
		

	}

}
