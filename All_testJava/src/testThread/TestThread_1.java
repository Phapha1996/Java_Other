package testThread;

public class TestThread_1 {

	public static void main(String[] args) {
		
		Thread dog = new SpeakDog();		//在内存中分配对象
		Thread cat = new SpeakCat();			
		
		dog.start();		//告诉JVM，开始排队
		cat.start();
		
		for(int i=0;i<15;i++){
			System.out.println("蔡智法"+i+" ");
		}
		
	}

	
}
