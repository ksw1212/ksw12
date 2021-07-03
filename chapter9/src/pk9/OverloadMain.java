package pk9;

public class OverloadMain {

	public static void main(String[] args) {
		Overload load =new Overload(20, 1f, "홍길동");
		load.Disp();
		Overload lo = new Overload(20, 1f);
		lo.Disp();
	}

}
