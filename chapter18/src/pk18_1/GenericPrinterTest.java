package pk18_1;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		//형변환이 필요없다.
		Powder power=powderPrint.getMaterial();
		System.out.println(powderPrint);
		powderPrint.printing();
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic pla = plasticPrint.getMaterial();
		System.out.println(plasticPrint);
		plasticPrint.printing();
		/*
		 GenericPrinter<Water> waterprint = new GenericPrinter<Water>();
		 waterprint.setMaterial(new Water()); 
		 Water water = waterprint.getMaterial();
		 System.out.println(waterprint);
		 */
	}

}
