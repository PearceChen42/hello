import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try {
		checkAge(age);
		}
		catch(Exception e) {
			System.out.println("A problem occured: " + "\n" + e);
		}
	}

	static void checkAge(int age) throws AgeException {
		
		if(age<18) {
			throw new AgeException("You must be 18+ to sign!");
			
		}
		else {
			System.out.println("You are now signed up!");
		}
		
	}
	
}
