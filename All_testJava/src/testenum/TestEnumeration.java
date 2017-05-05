package testenum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.SimpleFormatter;

import org.junit.Test;

public class TestEnumeration {

	enum Season{
		spring,summer,winter,autumn;
	}
	
	@Test
	public void testenum(){
		
		Season[] array = Season.values();
		
		for(Season index:array){
			System.out.println(index);
		}
		
		
	}
	
	@Test
	public void testStr(){
		//StringBuffer sb = new StringBuffer("student");
		//System.out.println(sb.reverse());
		//System.out.println(sb.charAt(2));
		//sb.setCharAt(2, 'f');
		
		//System.out.println(sb);

		//String s = "hello world my,Java programming!";
		/*StringTokenizer st = new StringTokenizer(s, ", ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}*/
		
		/*String s = "hello world my Java programming!";
		Scanner sn = new Scanner(s);
		while(sn.hasNext()){
			System.out.println(sn.next());
		}
		*/
		
		String str = "我今年 19 岁， 1996 年出生，现在读 4 ，在 9 中读过";
		Scanner s = new Scanner(str);
		while(s.hasNext()){
			
			try{
			System.out.println(s.nextInt());
			}catch(InputMismatchException e){
				s.next();
			}
		}
	
	}
	
	
	@Test
	public void testDate(){
		/*Date date1 = new Date();
		Date date2 = new Date(1000);//1970-1-1 8:00:00
		System.out.println(date1);*/
		
		/*Date date = new Date();
		String s = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(s);
		System.out.println(sdf.format(date));
		*/
		
		try {
		//将字串类型的转换成date类型
		String dt = "1996-01-17";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(dt);
		
		
		System.out.println(sdf.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
