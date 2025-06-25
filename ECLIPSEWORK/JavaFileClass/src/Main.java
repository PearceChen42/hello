import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file = new File("Secret_Message.txt");
		
		
		if(file.exists()) {
		System.out.println("That file exists! : O!");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
	}
		else {
		System.out.println("That file doesn't exist :(");	
		}
		}

}
