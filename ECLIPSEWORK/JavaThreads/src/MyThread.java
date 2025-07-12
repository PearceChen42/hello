
public class MyThread extends Thread {

	@Override
	public void run() {
		
		if(this.isDaemon()) {
			
			System.out.print("This is a daemon thread is running!\n");
		}
		else {
			System.out.print("This thread is running!\n");
		}
		
	}
}
