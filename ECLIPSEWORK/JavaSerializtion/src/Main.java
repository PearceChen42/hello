import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		User user = new User();
		
		user.name = "Man ";
		user.password = "I <3 pizza";
		
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object info save");
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}

}
