package testJavaNet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestNet_1 {

	public static void main(String[] args) {
		Scanner scanner;
		URL url;						//url类中封装了   协议，地址，资源
		Thread readURL;
		Look look = new Look();
		System.out.println("请输入url资源");
		scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		
		try {
			url = new URL(source);
			look.setUrl(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		readURL = new Thread(look);
		readURL.start();
	}

}
