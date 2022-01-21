package interaction;

public class Seller {
	private int money;
	private int mango;
	private int mango_price;
	
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		this.mango_price = 5;
	}
	
	public void showSeller() {
		System.out.println("Money: " + this.money
				+ '\n' + "Mango: " + this.mango);
	}
	
	public void sellMango(int mango){
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다");
			return;
		}
		this.mango -= mango;
		this.money += (mango*this.mango_price);

		 
	}

	public int getMango() {
		return mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}
}
