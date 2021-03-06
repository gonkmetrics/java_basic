package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc1 = new Orc();
		Warrior war1 = new Warrior();
		war1.huntOrc(orc1);
		war1.huntOrc(orc1);
		
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
