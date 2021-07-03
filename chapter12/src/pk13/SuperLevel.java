package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("점프할수있음");

	}

	@Override
	public void turn() {
		System.out.println("턴 할수있음");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*************고수 입니다.*************");

	}


}
