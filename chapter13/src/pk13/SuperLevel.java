package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("무지 빠르게 달립니다");
	}
	@Override
	public void jump() {
		System.out.println("아주 높이 Jump합니다");
	}
	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("********고급자 입니다********");
	}

}
