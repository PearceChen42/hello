package defaultpackage;

public class JavaPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("This is a format string %d \n", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		System.out.printf("%b\n",myBoolean);
		System.out.printf("%c\n",myChar);
		System.out.printf("Hello %-10s\n",myString);
		System.out.printf("%d\n",myInt);
		System.out.printf("%.5f\n",myDouble);
		
		System.out.printf("%,+20f\n",myDouble);
	}

}
