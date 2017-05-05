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
				//�������ǰ�ӿڵķ���
				//Class clazzB = B.class;
			//	Method method = clazzB.getMethod("SetFage", Fage.class);
				
				//
				
				
				// ��ȡ�����ļ����õ�Bean
				// �õ�bean֮���a��ֵ����new����
				a.SetFage((Fage)Class.forName(bean).newInstance());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
