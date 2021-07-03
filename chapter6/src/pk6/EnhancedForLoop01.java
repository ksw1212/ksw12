package pk6;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String strArray[]= {"Java","Python","Android","C","JavaScript"};
		/*
		 * for(int i=0;i<strArray.length;i++) { System.out.println(strArray[i]); }
		 */
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}

}
