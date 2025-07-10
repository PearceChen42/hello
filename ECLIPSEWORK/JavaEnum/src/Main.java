
enum Planet{
	MERCURY(1),
	VENNUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	RUANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	int number;
	
	Planet( int number) {
		this.number = number;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planet myPlanet = Planet.EARTH;
		
		canILiveHere(myPlanet);
		
	}
	
	
	static void canILiveHere(Planet p) {
		
		switch(p) {
		case EARTH:
			System.out.println("You can live here!");
			System.out.println("This is planet *" + p.number);break;
		case MARS:
			System.out.println("You will live here in 20 years later but not now!");
			System.out.println("This is planet *" + p.number);break;
		default:
			System.out.println("You can't live here ...yet");
			System.out.println("This is planet *" + p.number);break;
		}
		
		
	}

}
