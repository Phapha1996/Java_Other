package org.fage.testFatherAndSon;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestFatherAndSon {
	
	@Test
	public void test() {
		/*
		 * Car car = new Car(); 
		 * Bmw b = new Bmw();	��ת�Ͷ���
		 *  car = b;
		 *   b.drive();
		 */

		/*
		 * Car car = new Car(); 
		 * Bmw b = new Bmw(); 
		 * if(car instanceof Bmw){ 
		 *	 b =(Bmw) car;				����ת������ȫ
		 *   b.drive(); b.bdrive();
		 *   }
		 */

		Car car = new Bmw();

		if (car instanceof Bmw) {// /��ȫ������ת��
			Bmw b = (Bmw) car;
			b.bdrive();

		}

		Collection con = new LinkedList();
		List list = null;
		if (con instanceof List) {	//���Ͱ�ȫ
			list = (List) con;
			System.out.println(list.toString());
		}

	}
}
