package testJavaNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_2 {

	public static void main(String[] args) {

		Scanner scanner = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",2010);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
