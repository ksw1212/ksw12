package pk8;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		TimesTable tt= new TimesTable();
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		tt.showTable(a);

	}

}
