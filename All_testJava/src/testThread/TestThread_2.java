package testThread;

public class TestThread_2 {

	public static void main(String[] args) {

		Road road = new Road();
		Thread driver = new Thread(road);
		Thread police = new Thread(road);
		driver.setName("˾��");
		police.setName("����");
		road.setAttachThread(driver);
		
		driver.start();
		police.start();
		System.out.println("���߳��Ѿ�����");
	}

}
