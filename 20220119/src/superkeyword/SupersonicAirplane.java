package superkeyword;

public class SupersonicAirplane extends Airplane {

	public SupersonicAirplane(int speedPlane) {
		//parent constructor is not inherited
		//in order to refer to the parent class, the super keyword is used
		//super() calls the parent class's constructor and must be the first statement
		
		super(speedPlane);
		System.out.println(speedPlane);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		if(speedPlane + 500 <= 900) {
			super.fly();
		} else {
			if(speedPlane + 500 <= 1300) {
				speedPlane += 500;
			} else {
				speedPlane = 1300;
			}
			//System.out.println();
		}
		System.out.println("airspeed: "+speedPlane);
		
		/*
+------------------------+-----------------------------------------------------------------------------+
| 스택                   | 힙                                                                           |
+------------------------+-----------------------------------------------------------------------------+
| main                   | 메모리 주소(n)                                                                |
+------------------------+-----------------------------------+--------------------------+--------------+
| SupersonicAirplane sa1 | class Airplane                    | int speedPlane           | 300          |
|                        | pointer 1/100번                   +--------------------------+--------------+
|                        |                                   | constructor                             |
|                        |                                   | method fly();                           |
|                        |                                   | method breakSpeed();                    |
|                        +-----------------------------------+-----------------------------------------+
|                        | class SupersonicAirplane          | int speedPlane from superclass Airplane |
|                        | pointer 2/200번                   +-----------------------------------------+
|                        |                                   | constructor                             |
|                        |                                   | method fly();                           |
|                        |                                   | sp < 1300                               |
+------------------------+-----------------------------------+-----------------------------------------+
		 */
		
		
		
		
		//else if (speedPlane >= 900 && speedPlane <= 1300){
		//	speedPlane += 500;
		}
	}
