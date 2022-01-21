package accessmodifier;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magician mage1 = new Magician("mage1");
		mage1.getInfo();
		mage1.hunt();
		mage1.hunt();
		mage1.fireball();
		mage1.getInfo();
		
		/*
+----------------+----------------------------------------------------------------+-----------------------------------------+
| 스택           | 힙                                                             | executing order:                        |
+----------------+----------------------------------------------------------------+                                         |
| main           | 메모리 주소(n)                                                 | object mage1 created                    |
+----------------+-----------------------------------+-------------+--------------+                                         |
| Magician mage1 | class Commoner                    | int hp      | 20           | invoke getInfo()                        |
|                | pointer 1/100번                   | int mp      | 10           | invoke getter for hp, mp, lv, exp, name |
|                |                                   | int lv      | 1            | grab values from parent class commoner  |
|                |                                   | int exp     | 0            | print to console                        |
|                |                                   | String name | mage1 (name) |                                         |
|                |                                   +-------------+--------------+ invoke hunt()                           |
|                |                                   | constructor                | invoke setter for hp, exp               |
|                |                                   | methods: getter, setter    | grab then modify values for hp, exp     |
|                +-----------------------------------+----------------------------+ print to console                        |
|                | class Magician                    | inherited methods          |                                         |
|                | pointer 2/200번                   +----------------------------+ invoke fireball()                       |
|                |                                   | constructor                | invoke setter for mp, exp               |
|                |                                   | method hunt()              | grab then modify values for mp, exp     |
|                |                                   | method getInfo()           | print to console                        |
|                |                                   | method fireball()          |                                         |
+----------------+-----------------------------------+----------------------------+-----------------------------------------+
	invoking getInfo() invokes the getters in Commoner which read the values int N
*/
		System.out.println("-----------------------");
		Warrior war1 = new Warrior("war1");
		war1.getInfo();
		war1.hunt();
		war1.doubleAttack();
		war1.getInfo();
	}

}
