package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Orc orc1 = new Orc();
		Warrior war1 = new Warrior();
		war1.huntOrc(orc1);
		war1.huntOrc(orc1);
		*/
		//-----------------------
		/*
		Wolf wolf1 = new Wolf();
		Goblin goblin1 = new Goblin();
		war1.huntWolf(wolf1);
		war1.huntWolf(wolf1);
		war1.huntWolf(wolf1);
		war1.huntGoblin(goblin1);
		Rabbit rabbit1 = new Rabbit();
		war1.huntRabbit(rabbit1);
		*/
		//-----------------------
		
		Magician mage1 = new Magician();
		Goblin goblin2 = new Goblin();
		mage1.huntGoblin(goblin2);
		
		System.out.println("----------------------");
		//-----------------------
		
		Archer archer1 = new Archer();
		Goblin goblin3 = new Goblin();
		archer1.huntGoblin(goblin3);
		
		
		
		/*
+-------------+------------------------------------------------------------------+--------------------+
| 스택         | 힙                                                                |                    |
+-------------+------------------------------------------------------------------+                    |
| main        | 메모리 주소(n)                                                      |                    |
+-------------+-----------------------------------+---------+--------------------+                    |
| object war1 | class Warrior                     | int hp  | 20 » 17            |                    |
| object orc1 | pointer 1/100번                    | int atk | 4                  |                    |
|             |                                   | int mp  | 10                 |                    |
|             |                                   | int exp | 0 >> 10            |                    |
|             |                                   | int lvl | 1                  |                    |
|             |                                   +---------+--------------------+                    |
|             |                                   | constructor                  |                    |
|             |                                   | method huntOrc(orc)          |                    |
|             |                                   | methods: getter, setter      |                    |
|             +-----------------------------------+---------+--------------------+                    |
|             | class Orc                         | int hp  | 5 » 1 » -3, return |                    |
|             | pointer 2/200번                    | int atk | 3                  |                    |
|             |                                   +---------+--------------------+                    |
|             |                                   | constructor                  |                    |
|             |                                   | method doBattle(int)         |                    |
|             |                                   | methods: setter, getter      |                    |
+-------------+-----------------------------------+------------------------------+--------------------+
		 */

	}

}

//Polymorphism: when multiple objects need to be addressed with a single method
//To use polymorphism, it is necessary to inherit

