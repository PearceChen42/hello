import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you wang?");
		System.out.print("(1=dog) or (2=cat):");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else{
			animal = new Animal();
			animal.speak();
		}
		
		
		
	}

}
