package interaction;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seller sell1 = new Seller(5);
		sell1.showSeller();
		
		Buyer buy1 = new Buyer(0);
		buy1.setMoney(10);
		buy1.showBuyer();
		
		System.out.println("---------------------");
		buy1.buyMango(sell1, 6);
		
		sell1.showSeller();
		buy1.showBuyer();

	}

}
