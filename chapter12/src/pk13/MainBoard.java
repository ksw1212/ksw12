package pk13;

public class MainBoard {

	public static void main(String[] args) {
		//기본 게임 레벨 1단계
		Player player = new Player();
		
		player.Play(1);
		
		
		
		//레벨 2단계
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);//중급자 레벨로 세팅
		player.Play(2);//aLevel.go
		
		
		//레벨 3단계
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.Play(3);
	}

}
