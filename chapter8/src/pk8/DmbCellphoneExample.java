package pk8;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		DmbcellPhone dmbCellPhone = new DmbcellPhone("JavaPhone", "흰색", 11);
		//cellPhone클래스에 있는 변수
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.color);
		//DmbCellPhone
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		//CellPhone으로 부터 상속받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receVoice("안녕하세요");
		dmbCellPhone.sendVoice("아 안녕! 공부좀 하세요");
		dmbCellPhone.receVoice("싫어요~~~");
		dmbCellPhone.hangUp();
		//DmbcellPhone으로 부터 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDMB(7);
		dmbCellPhone.turnOffDmb();
		
		
		
		
		

	}

}
