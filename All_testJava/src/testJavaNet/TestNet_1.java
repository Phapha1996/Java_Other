package testJavaNet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestNet_1 {

	public static void main(String[] args) {
		Scanner scanner;
		URL url;						//url���з�װ��   Э�飬��ַ����Դ
		Thread readURL;
		Look look = new Look();
		System.out.println("������url��Դ");
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
