package testJavaNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		String[] answer = {"�����������","��ֻ������","���ӣ������ɳ��"};
		ServerSocket serverForCilent = null;
		Socket socketOnServer = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			serverForCilent = new ServerSocket(2010);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ȴ��ͻ������������");
		try {
			socketOnServer = serverForCilent.accept();//����״̬���������˿ͻ����ĺ���
			out = new DataOutputStream(socketOnServer.getOutputStream());
			in = new DataInputStream(socketOnServer.getInputStream());
			
			for(int i=0;i<answer.length;i++){
				String s = in.readUTF();//in��ȡ��Ϣ����������״̬
				System.out.println("���������յ����Կͻ��˵����ʣ�"+s);
				out.writeUTF(answer[i]);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
