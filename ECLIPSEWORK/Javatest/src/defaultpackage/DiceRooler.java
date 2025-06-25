package defaultpackage;

import java.util.Random;

public class DiceRooler {
	
	Random random;
	int number = 0;
	
	
	DiceRooler() {
		//Random random = new Random();
		//int number = 0;
		//roll(random,number);
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
