package testThread;

public class ThreadAsRun {

	public static void main(String[] args) {
		//�����߳�ͬ�� 
		House_2 house = new House_2();
		house.setCake(10);
		Thread red = new Thread(house);
		red.setName("������");
		Thread black = new Thread(house);
		black.setName("������");
		red.start();
		black.start();
	}

}
