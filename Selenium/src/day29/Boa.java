package day29;

public class Boa  implements Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boa b=new Boa();
		b.debit();
		b.credit();
		b.moneyTransfer();

	}

	@Override
	public void debit() {
		System.out.println("123");
		
	}

	@Override
	public void credit() {
		System.out.println("345");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("678");
		
	}

}
