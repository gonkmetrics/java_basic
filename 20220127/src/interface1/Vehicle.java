package interface1;

public interface Vehicle {
		//interfaces:
		//these are another way to do abstraction in java without using abstract classes
		//interfaces can only contain constants and methods without bodies. no variables
		//in order to use an interface it must be implemented by using the keyword
		//keyword implements, in the same place as the keyword extends
	
	int MIN_SPEED = 0;
	int MIN_GAS = 0;
	int MAX_SPEED = 200;
	int MAX_GAS = 70;
	int DEC_GAS = 1;
	int DEC_SPEED = 0;
	int FAC_SPEED = 10;
	int INC_GAS = 30;
	
	int TRAIN_MIN_SPEED = 0;
	int TRAIN_MIN_GAS = 0;
	int TRAIN_MAX_SPEED = 400;
	int TRAIN_MAX_GAS = 3500;
	int TRAIN_DEC_GAS = 30;
	int TRAIN_DEC_SPEED = 50;
	int TRAIN_INC_SPEED = 100;
	int TRAIN_INC_GAS = 700;
	

	//using an interface without constants:
	//methods without bodies lack the below:
	//{
	// (code)
	//}
	//but they do need to be declared
	public void accel();
	public void breakSpeed();
	public void reFuel();
	public void showStatus();

}
