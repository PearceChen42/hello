package defaultpackage;

public class JavaConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man = new Human("Rick",65,70);
		Human man2 = new Human("Morty",16,50);
		System.out.println(man.name);
		System.out.println(man2.name);
		man2.eat();
		man.drink();
	}

}
