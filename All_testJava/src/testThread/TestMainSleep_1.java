package testThread;

public class TestMainSleep_1 {

	public static void main(String[] args) {
		
		System.out.println("����˯���룡����");
		Thread t = Thread.currentThread();//�õ���ǰ�����߳�
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("˯�ɹ��ˣ���1");
	}

}
