package test;

import org.junit.Test;

public class TestClassObject {

	@Test
	public void test_1(){
//		System.out.println(void.class.getName());
//		System.out.println(TestClassObject.class.getName());
//		System.out.println(double.class.getName());
		
//		String str1 = "大家好我是fage";
//		String str2 = "大家好我是几倍济南";
//		
//		Class clazz1 = str1.getClass();
//		Class clazz2 = str2.getClass();
//		System.out.println(clazz1.getName()+"*"+clazz2.getName());
//		System.out.println(clazz1==clazz2);
		
//		try {
//			System.out.println(Class.forName("test.A").getClassLoader());
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(Class.forName("java.lang.Thread").getClassLoader());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
