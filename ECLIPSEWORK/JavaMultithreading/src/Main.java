
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		
		thread1.setDaemon(true);
		//thread2.setDaemon(true);
		thread1.start();
		
		thread1.join(1000);
		thread2.start();
		
		System.out.println(1/0);
		
	}

}
