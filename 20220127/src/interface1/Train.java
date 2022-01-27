package interface1;

//as mentioned earlier, to implement an interface use the keyword implements
public class Train implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = TRAIN_MIN_SPEED;
		this.gas = TRAIN_MAX_GAS;
		this.name = name;
	}
	
	//because the methods without bodies need to be declared in order
	//for the interface to be used, they are declared below:

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		if(speed+TRAIN_INC_SPEED >= TRAIN_MAX_SPEED) {
			speed = TRAIN_MAX_SPEED;
			return;
		} else {
		speed += TRAIN_INC_SPEED;
		}
		gas -= TRAIN_DEC_GAS;
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		if(speed-TRAIN_DEC_SPEED <= TRAIN_MIN_SPEED) {
			speed = TRAIN_MIN_SPEED;
			return;
		} else {
			speed -= TRAIN_DEC_SPEED;
		}
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub
		gas += TRAIN_INC_GAS;
		if (gas + TRAIN_INC_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("Speed: " + speed +'\n' + "Gas: " + gas +'\n' + "Name: " + name);
		
	}
	
	
	
	

	}


