package testThread;

public class TestThread_1 {

	public static void main(String[] args) {
		
		Thread dog = new SpeakDog();		//���ڴ��з������
		Thread cat = new SpeakCat();			
		
		dog.start();		//����JVM����ʼ�Ŷ�
		cat.start();
		
		for(int i=0;i<15;i++){
			System.out.println("���Ƿ�"+i+" ");
		}
		
	}

	
}
