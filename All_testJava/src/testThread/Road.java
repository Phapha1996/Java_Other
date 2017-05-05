package testThread;

public class Road implements Runnable {

	Thread attachThread;
	public void setAttachThread(Thread t){
		attachThread = t;
	}
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		if(name.equals("司机")){
			try{
				System.out.println("我是"+name+"在马路上开车");
				System.out.println("想睡一个小时在开车");
				Thread.sleep(1000*60*60);
			}catch(InterruptedException e){
				System.out.println(name+"被警察叫醒了");
			}
			System.out.println("继续开车");
			
		}else if(name.equals("警察")){		//如果是警察
			for(int i=0;i<3;i++){
				System.out.println(name+"喊：开车开车！！");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			attachThread.interrupt();//吵醒老司机
		}
		
		System.out.println(name+"线程死亡了");//显示一下线程的状态
	}

}
