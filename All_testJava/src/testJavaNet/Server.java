package testJavaNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		String[] answer = {"在算错的情况下","狗只能生狗","电视，面包，沙发"};
		ServerSocket serverForCilent = null;
		Socket socketOnServer = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			serverForCilent = new ServerSocket(2010);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("等待客户机的请求呼叫");
		try {
			socketOnServer = serverForCilent.accept();//阻塞状态，除非来了客户机的呼叫
			out = new DataOutputStream(socketOnServer.getOutputStream());
			in = new DataInputStream(socketOnServer.getInputStream());
			
			for(int i=0;i<answer.length;i++){
				String s = in.readUTF();//in读取信息，处于阻塞状态
				System.out.println("服务器接收到来自客户端的提问："+s);
				out.writeUTF(answer[i]);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
