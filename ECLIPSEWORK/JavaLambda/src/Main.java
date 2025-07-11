
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "bro";
		char symbol = '!';
		
		 MyInterFace Interface = (x, y) ->{ 
		 System.out.println("Hello World!");
		 System.out.println("It is a nice day,no? "+ x + y );
		 };
		 
		 
		 MyInterFace Interface2 = (x, y) ->{ 
			System.out.println("Hello " + x + y); 
			 
		 };
		 
		 
		Interface.message(name,symbol);
		Interface2.message(name, symbol);
		
		MyFrame myframe = new MyFrame();
		
	}

}
