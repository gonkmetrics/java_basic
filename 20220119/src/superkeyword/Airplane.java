package superkeyword;

public class Airplane {
	protected int speedPlane;
	
	public Airplane(int speedPlane) {
		this.speedPlane = speedPlane;
	}
	
	public void fly() {
		if((this.speedPlane+500)>900) {
			this.speedPlane = 900;
		} else {
			this.speedPlane += 500;
		}
		System.out.println("Airspeed: "+speedPlane);
		//if(this.speedPlane > 900) {
		//	this.speedPlane = 900;
		//} else {
		//	this.speedPlane = speedPlane;
		}
	
	//breakSpeed()
	
	public void breakSpeed() {
		if((this.speedPlane - 100) < 0) {
			this.speedPlane = 0;
		} else {
			this.speedPlane -= 100;
		}
		System.out.println("Airspeed: "+speedPlane);
	}
	}

