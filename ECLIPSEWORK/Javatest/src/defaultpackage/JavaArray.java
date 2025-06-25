package defaultpackage;

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Camaro","Corvette","Tesla"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		String[] car = new String[3];
		
		car[0] = "Camaro";
		car[1] = "Corvette";
		car[2] = "Tesla";
		
		System.out.println(car[2]);
		
		for(int i = 0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
	}

}
