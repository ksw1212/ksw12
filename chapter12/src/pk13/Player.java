package pk13;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		//PlayerLevel level = new BegginerLevel();
		level=new BeginnerLevel(); //초보자로 메모리할당
		level.showLevelMessage(); //초보자 메세지
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	public void Play(int count) {
		level.go(count);
	}
}
