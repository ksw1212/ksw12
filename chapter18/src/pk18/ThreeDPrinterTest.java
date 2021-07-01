package pk18;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter printPowder = new ThreeDPrinter();
		Powder p1 =new Powder();
		printPowder.setMaterial(p1);
		//다운캐스팅:Powder가 Object타임의 매개변수를 갖고있는메소드를 참조
		Powder pow=(Powder)printPowder.getMaterial();
		System.out.println(pow);
		Plastic p2 = new Plastic();
		ThreeDPrinter printPlastic = new ThreeDPrinter();
		printPlastic.setMaterial(p2);
		Plastic pla = (Plastic)printPlastic.getMaterial();
		System.out.println(pla);
		
	}

}
