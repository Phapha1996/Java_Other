package testThread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class JavaClock {

	//ʱ�䶨ʱ��
	public static void main(String[] args) {

		Timer t = new Timer();
		t.schedule(new TimerTask(){
			public void run(){
				System.out.println(new Date());
			}
		},0,1000);
		
	}

}
