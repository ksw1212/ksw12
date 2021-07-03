package pk6;

public class CharArray02 {

	public static void main(String[] args) {

		char alphabet[] = new char[26];
		char ch  = 'A';//ASCII = 65
		
		/*
		 * System.out.println(ch++); System.out.println(ch);
		 */
		for(int i = 0;i<alphabet.length;i++,ch++) {
			alphabet[i]=ch;
			
		}
		for(int i=0; i<alphabet.length;i++) {
			System.out.println(alphabet[i]+", "+(int)alphabet[i]);
		}

	}

}
