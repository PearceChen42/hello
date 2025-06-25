package defaultpackage;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y =4;
		
		int z = add(x,y);
		String name = "Bro";
		
		System.out.println(z);
		int age = 21;
		hello(name, age);
		
	}
	static int add(int x, int y) {
		int z = x+y;
		return z;
	}
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
	}

}
