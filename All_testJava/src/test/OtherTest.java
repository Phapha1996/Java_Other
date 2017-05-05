package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OtherTest {
	int result = 0;
	@Test
	public void test(){
		List list = new ArrayList();
		int num = 10;
		int index=0;
		/* 1=1
		 * 2=(1+1)
		 * 3=2+2=(1+1)+(1+1)
		 * 4=3+3=(1+1+1+1)+(1+1+1+1)
		 * 
		 */
		System.out.println(t(3));
		
		
	}
	
	
	public int t(int num){
		int index=0;
		if(num==1){
			index+=1;
			return index;
		}
		index += (num-1)*2*t(num-1);
		return index;
	}
	
	
	
}
