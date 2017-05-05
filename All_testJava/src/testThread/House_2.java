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
				System.out.println(Thread.currentThread().getName()+"进入死亡状态");
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
		System.out.println(Thread.currentThread().getName()+"想吃"+m+"克蛋糕");
		cake = cake-m;
		if(cake>=0){
			System.out.println(Thread.currentThread().getName()+"发现蛋糕还剩"+cake+"克");
		}else{
			System.out.println(Thread.currentThread().getName()+"发现蛋糕没了！");
		}
	}
}
