package testThread;

public class House implements Runnable{

	int cake;

	
	public void setCake(int cake) {
		this.cake = cake;
	}


	@Override
	public void run() {
		int m = 2;

		while(true){
			if(cake<=0){
				System.out.println(Thread.currentThread().getName()+"��������״̬");
				return;
			}
			System.out.println(Thread.currentThread().getName()+"��"+m+"�˵���");
			cake = cake-m;
			if(cake>=0){
				System.out.println(Thread.currentThread().getName()+"���ֵ��⻹��"+cake+"��");
			}else{
				System.out.println(Thread.currentThread().getName()+"���ֵ���û�ˣ���");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
