package pk13;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("점프가능");

	}

	@Override
	public void turn() {
		System.out.println("턴 못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*************중수 입니다.*************");

	}

	

}
