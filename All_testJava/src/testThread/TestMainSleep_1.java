package testThread;

public class TestMainSleep_1 {

	public static void main(String[] args) {
		
		System.out.println("我想睡两秒！！！");
		Thread t = Thread.currentThread();//得到当前的主线程
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("睡成功了！！1");
	}

}
