package testThread;

public class Road implements Runnable {

	Thread attachThread;
	public void setAttachThread(Thread t){
		attachThread = t;
	}
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		if(name.equals("˾��")){
			try{
				System.out.println("����"+name+"����·�Ͽ���");
				System.out.println("��˯һ��Сʱ�ڿ���");
				Thread.sleep(1000*60*60);
			}catch(InterruptedException e){
				System.out.println(name+"�����������");
			}
			System.out.println("��������");
			
		}else if(name.equals("����")){		//����Ǿ���
			for(int i=0;i<3;i++){
				System.out.println(name+"����������������");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			attachThread.interrupt();//������˾��
		}
		
		System.out.println(name+"�߳�������");//��ʾһ���̵߳�״̬
	}

}
