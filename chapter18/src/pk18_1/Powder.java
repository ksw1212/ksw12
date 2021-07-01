package pk18_1;

public class Powder extends Material{
	
	public String toString() {
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powdder재료로 만듭니다.");
		
	}
	
}
