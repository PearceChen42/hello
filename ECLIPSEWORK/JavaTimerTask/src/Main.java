import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Timer timer = new Timer();
	
		
		TimerTask  task = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				if(counter>0) {
				System.out.println("Task is complete :)");
				counter--;
				}
				else {
					System.out.println("Timer complete");
					timer.cancel();
				}
			}
		} ;
		
		Calendar date = Calendar.getInstance();
		/*
		date.set(Calendar.YEAR,2025);
		date.set(Calendar.MONTH,Calendar.JULY);
		date.set(Calendar.DAY_OF_MONTH,12);
		date.set(Calendar.HOUR_OF_DAY,18);
		date.set(Calendar.MINUTE,47);
		date.set(Calendar.SECOND,50);
		*/
		
		
	
		
		
		//timer.schedule(task, 3000);
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
	}

}
