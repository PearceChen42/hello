
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?");
		int distance = scan.nextInt();
		
		takeAStep(0,distance);
		
		
	}
	
	static void takeAStep(int i , int distance) {
		if (i<distance) {
			i++;
			System.out.println("*You take a step* : " + i + " meter");
			takeAStep(i,distance);
		}
		else {
			System.out.println("You are done walking");
		}
	}

}
