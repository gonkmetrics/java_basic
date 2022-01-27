package interface1;

//as mentioned earlier, to implement an interface use the keyword implements
public class Car implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Car(String name) {
		this.speed = MIN_SPEED;
		this.gas = MAX_GAS;
		this.name = name;
	}
	
	//because the methods without bodies need to be declared in order
	//for the interface to be used, they are declared below:

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		if(speed+FAC_SPEED >= MAX_SPEED) {
			speed = MAX_SPEED;
			return;
		} else {
		speed += FAC_SPEED;
		}
		gas -= DEC_GAS;
		
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		if(speed-FAC_SPEED <= MIN_SPEED) {
			speed = MIN_SPEED;
			return;
		} else {
			speed -= FAC_SPEED;
		}
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub
		gas += INC_GAS;
		if (gas + INC_GAS > MAX_GAS) {
			gas = MAX_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("Speed: " + speed +'\n' + "Gas: " + gas +'\n' + "Name: " + name);
		
	}
	
	
	
	

	}


