package pk20;

public class AddTest {

	public static void main(String[] args) {
		Add addf =(x,y) -> x+y;
		System.out.println(addf.add(3, 5));
		System.out.println(addf.add(5, 23));
	}

}
