package pk6;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {

		String str[] = {"ab111","cd222","ef333","fh444","ij555"};
		String res="";
		int i;
		
		for(i=0;i<=str.length;i++) {
			res+=str[i]+"\n";//enter:\n
			System.out.println(res);
			JOptionPane.showMessageDialog(null, "배열 원소의 값\n"+ res);
		}
		
	}

}
