package defaultpackage;
import java.util.Scanner;
public class JavaLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}

}
