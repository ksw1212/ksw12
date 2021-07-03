package pk13;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();//Error:추상클래스는 인스턴스(heap메모리,객체) 할 수 없다.
		Computer c2 = new DeskTop();
		//Computer c3 = new Notebook();
		
		Computer c4 = new MyNotebook();
		c2.typing();
		c4.typing();

	}

}
	