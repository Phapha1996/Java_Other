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
				System.out.println(Thread.currentThread().getName()+"进入死亡状态");
				return;
			}
			System.out.println(Thread.currentThread().getName()+"吃"+m+"克蛋糕");
			cake = cake-m;
			if(cake>=0){
				System.out.println(Thread.currentThread().getName()+"发现蛋糕还有"+cake+"克");
			}else{
				System.out.println(Thread.currentThread().getName()+"发现蛋糕没了！！");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
