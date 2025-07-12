import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		User user;
		
		FileInputStream fileIn = new FileInputStream("../JavaSerializtion/Userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name + ": " + user.password);
		user.sayHello();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}

}
