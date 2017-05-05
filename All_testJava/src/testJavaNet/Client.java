package testJavaNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		String[] message = {"1+1在什么情况下不等于2?","狗为什么不生跳蚤？","什么东西能看，能吃，能坐？"};
		Socket mysoket;			//客户端套接字
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			mysoket = new Socket("127.0.0.1",2010);	//通过这个IP地址与这个端口查找服务器程序
			in = new DataInputStream(mysoket.getInputStream());
			out = new DataOutputStream(mysoket.getOutputStream());
			for(int i=0;i<message.length;i++){
				out.writeUTF(message[i]);
				String s = in.readUTF();	//读取信息，会阻塞主线程，等待读取
				System.out.println("收到服务器回答："+s);
				Thread.sleep(5000);
			}
			mysoket.close();
		} catch (Exception e) {
			System.out.println("服务器已经断开"+e);
		}
	}

}
