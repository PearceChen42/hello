
public class Friend {
	
	String name;
	static int numberofriends;
	
	
	Friend(String name) {
		this.name=name;
		numberofriends++;
		
		
	}

	static void displayFriends() {
		System.out.println("You have " +numberofriends + " friends");
	}
	
}
