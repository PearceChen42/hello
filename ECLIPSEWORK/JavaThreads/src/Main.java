
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		//System.out.println(Thread.activeCount()) ;
		
		Thread.currentThread().setName("MAINNNN");
		System.out.println(Thread.currentThread().getName()) ;
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority() );
		
		System.out.println(Thread.currentThread().isAlive() );
		
		for(int i =3; i>0l;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.print("You are done!\n");
		
		MyThread thread2 = new MyThread();
		System.out.print(thread2.isDaemon()+ "\n");
		thread2.setDaemon(true);
		thread2.start();
		System.out.print(thread2.isDaemon()+ "\n");
		System.out.println(Thread.activeCount()) ;
		System.out.println(thread2.isAlive());
		System.out.println(thread2.getName());
		System.out.println(thread2.getPriority());
		
	}

}
