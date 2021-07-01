package pk18_1;

public class GenMain {

	public static void main(String[] args) {
		Integer iArr[] = {1,2,3,4,5};
		Double dArr[] = {1.0,2.0,3.0,4.0,5.0};
		Character cArr[] = {'A','B','C','D','E'};
		Gen gen = new Gen();
		/*
		 * Gen<Integer> genI = new Gen<Integer>(); 
		 * genI.printArr(iArr);
		 * System.out.println(); 
		 * Gen<Double> genD = new Gen<Double>();
		 * genD.printArr(dArr); 
		 * System.out.println(); 
		 * Gen<Character> genC = new
		 * Gen<Character>(); genC.printArr(cArr);
		 *  System.out.println();
		 */
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}

}
