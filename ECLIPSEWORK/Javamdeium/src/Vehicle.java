
public class Vehicle {
	
	double speed;
	void go() {
		System.out.println("This vehicle is moving");
		speed++;
	}
	
	void stop() {
		System.out.println("This vehicle is stoppend");
		speed=0;
	}
}
