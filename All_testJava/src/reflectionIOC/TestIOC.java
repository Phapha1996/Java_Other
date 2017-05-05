package reflectionIOC;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestIOC {
	public static void main(String[] args) {
		try {
			Fage fage = null;
			A a = new A();
			InputStream in = TestIOC.class.getClassLoader().getResourceAsStream("bean.properties");
			Properties prop = new Properties();
			prop.load(in);
			String bean = prop.getProperty("bean");
			
			
			if (a instanceof B) {
				//反射出当前接口的方法
				//Class clazzB = B.class;
			//	Method method = clazzB.getMethod("SetFage", Fage.class);
				
				//
				
				
				// 读取配置文件配置的Bean
				// 得到bean之后帮a赋值引用new对象
				a.SetFage((Fage)Class.forName(bean).newInstance());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
