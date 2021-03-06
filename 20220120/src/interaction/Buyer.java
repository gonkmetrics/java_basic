package interaction;

public class Buyer {
	private int money;
	private int mango;
	private int mango_price;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.mango_price = 5;
	}
	
	public void showBuyer() {
		System.out.println("Money: " + this.money
				+ '\n' + "Mango: " + this.mango);
	}
	
	public void buyMango(Seller seller, int mango) {
		if((seller.getMango()) < mango) {
			System.out.println("망고 재고가 부족합니다" + seller.getMango());
			return;
		}
		
		this.money -= (mango*this.mango_price);
		this.mango += mango;
		seller.sellMango(mango);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	/*
+--------------------+-------------------------------------------------------------+---------------------------------------+
| 스택               | 힙                                                           | executing order:                      |
+--------------------+-------------------------------------------------------------+                                       |
| main               | 메모리 주소(n)                                                | objects created                       |
+--------------------+-----------------------------------+------------+------------+                                       |
| object sell1, buy1 | class Seller                      | int mango  | 5          | execute buyMango(sell1, 1)            |
|                    | pointer 1/100번                   | int money  | 0          | this.money (buyer) decrease by 5      |
|                    |                                   +------------+------------+ this.mango (buyer) increase by 1      |
|                    |                                   | constructor             | within method invoke sellMango(mango) |
|                    |                                   | method showSeller()     | go to class Seller                    |
|                    |                                   | method sellMango()      | this.money (seller) increase by 5     |
|                    |                                   | methods: getter, setter | this.mango (seller) decrease by 1     |
|                    +-----------------------------------+------------+------------+                                       |
|                    | class Buyer                       | int mango  | 0          | execute showSeller()                  |
|                    | pointer 2/200번                   | int money  | 0 set(10)  | print to console                      |
|                    |                                   +------------+------------+                                       |
|                    |                                   | constructor             | execute showBuyer()                   |
|                    |                                   | method showBuyer()      | print to console                      |
|                    |                                   | method buyMango()       |                                       |
+--------------------+-----------------------------------+-------------------------+---------------------------------------+
	 */

}
