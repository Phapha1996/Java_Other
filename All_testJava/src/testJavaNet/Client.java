package testJavaNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		String[] message = {"1+1��ʲô����²�����2?","��Ϊʲô�������飿","ʲô�����ܿ����ܳԣ�������"};
		Socket mysoket;			//�ͻ����׽���
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			mysoket = new Socket("127.0.0.1",2010);	//ͨ�����IP��ַ������˿ڲ��ҷ���������
			in = new DataInputStream(mysoket.getInputStream());
			out = new DataOutputStream(mysoket.getOutputStream());
			for(int i=0;i<message.length;i++){
				out.writeUTF(message[i]);
				String s = in.readUTF();	//��ȡ��Ϣ�����������̣߳��ȴ���ȡ
				System.out.println("�յ��������ش�"+s);
				Thread.sleep(5000);
			}
			mysoket.close();
		} catch (Exception e) {
			System.out.println("�������Ѿ��Ͽ�"+e);
		}
	}

}
