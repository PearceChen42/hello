import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] intArray = {1,2,3,4,5 };
		Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
		Character[] charArray = {'H','E','L','L','O'};
		String[] stringArray = {"B","Y","E"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
		
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharactserClass myChar = new MyCharactserClass('@');
		MyStringClass myString = new MyStringClass("Hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		
		MyGenericClass<Integer,String> myint = new MyGenericClass(1,"Char");
		MyGenericClass<Double,String> mydouble = new MyGenericClass(3.14,"Hello");
		
		
		System.out.println(myint.getValue());
		System.out.println(mydouble.getValue());
	
		
		ArrayList<String> myFriends = new ArrayList<>();
		
		
		HashMap<Integer,String> users = new HashMap<>();
		
	}

	
	public static <Thing> void displayArray( Thing[] array) {
		
		
		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static <Thing> Thing getFirst(Thing[] array ) {
		return array[0];
	}
	
	
}
