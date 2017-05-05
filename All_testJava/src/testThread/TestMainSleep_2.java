package testThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMainSleep_2 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date date;
		for(int i=0;i<100;i++){
			try {
				t.sleep(100);
				date = new Date();
				System.out.println(sdf.format(date));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
