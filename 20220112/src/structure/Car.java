package structure;

public class Car {
	//멤버변수 or member variables are variables associated with a certain object(in java this being 
	//a class)
		public String modelName;
		public int modelPrice;
		public String modelOwner;
		
	//member method
	//with a method named getInfo(), get the model name, price, and owner
		
		public void getCarInfo() {
		System.out.println("모델:" + modelName + "가격:" + modelPrice + "주인:" + modelOwner);
		return;
		}

	}
