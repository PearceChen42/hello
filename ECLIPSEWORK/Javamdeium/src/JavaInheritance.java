
public class JavaInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Tesla");
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println("The speed of car: " + car.speed);
		System.out.println("The speed of bike : " + bike.speed);
		System.out.println("The Wheels of car: " + car.wheels);
		System.out.println("The Wheels of bike : " + bike.wheels);
		
		
	}

}
