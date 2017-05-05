package testThread;

public class House_2 implements Runnable {
	int cake = 2;
	public void setCake(int cake){
		this.cake = cake;
	}
	
	public void run(){
		while(true){
			anyDoing();
			if(cake<=0){
				System.out.println(Thread.currentThread().getName()+"��������״̬");
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	private synchronized void anyDoing() {
		int m = 2;
		System.out.println(Thread.currentThread().getName()+"���"+m+"�˵���");
		cake = cake-m;
		if(cake>=0){
			System.out.println(Thread.currentThread().getName()+"���ֵ��⻹ʣ"+cake+"��");
		}else{
			System.out.println(Thread.currentThread().getName()+"���ֵ���û�ˣ�");
		}
	}
}
