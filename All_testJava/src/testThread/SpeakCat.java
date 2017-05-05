package testThread;

public class SpeakCat extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("นทนท"+i+" ");
		}
	}
}
