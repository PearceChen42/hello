import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many times do you want to say hello?");
		int number = scan.nextInt();
		
		HelloWorld(number);
		
	}
	
	static void HelloWorld( int n) {
		
	if(n>0) {	
		
		System.out.println("Hello World!    " + n);
		HelloWorld(n -1);
		}
	}

}
