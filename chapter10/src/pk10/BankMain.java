package pk10;

public class BankMain {

	public static void main(String[] args) {
		Bank bk = new Bank("일산", "031-111-1111");
		Bank bk2 = new Bank("일산2", "031-123-4567");
		Bank.interest=1.2f;
		bk.getBank();
		
		bk2.interest=1.3f;
	    bk2.getBank();
	}

}
