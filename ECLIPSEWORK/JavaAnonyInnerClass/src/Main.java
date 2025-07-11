
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Greeting greeting = new Greeting() {
			@Override
			public void WelCome() {
				System.out.println("You bro!");
			}
			
			
		};
		
		Greeting greeting2 = new Greeting();
		
		greeting.WelCome();
		greeting2.WelCome();
	}

}
