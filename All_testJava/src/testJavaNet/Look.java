package testJavaNet;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Look implements Runnable{

	URL url;
	public void setUrl(URL url){
		this.url = url;
	}
	
	@Override
	public void run() {
		try {
			InputStream in = url.openStream();			//从url获得一个流，这个流指向url中封装的资源
			int n = -1;
			byte[] b = new byte[1024];
			while((n=in.read(b, 0, b.length))!=-1){
				String str = new String(b,0,n,"Unicode");
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
