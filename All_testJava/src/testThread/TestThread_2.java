package testThread;

public class TestThread_2 {

	public static void main(String[] args) {

		Road road = new Road();
		Thread driver = new Thread(road);
		Thread police = new Thread(road);
		driver.setName("司机");
		police.setName("警察");
		road.setAttachThread(driver);
		
		driver.start();
		police.start();
		System.out.println("主线程已经死亡");
	}

}
