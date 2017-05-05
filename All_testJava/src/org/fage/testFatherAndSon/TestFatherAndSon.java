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
		 * Bmw b = new Bmw();	上转型对象
		 *  car = b;
		 *   b.drive();
		 */

		/*
		 * Car car = new Car(); 
		 * Bmw b = new Bmw(); 
		 * if(car instanceof Bmw){ 
		 *	 b =(Bmw) car;				类型转换不安全
		 *   b.drive(); b.bdrive();
		 *   }
		 */

		Car car = new Bmw();

		if (car instanceof Bmw) {// /安全的向下转型
			Bmw b = (Bmw) car;
			b.bdrive();

		}

		Collection con = new LinkedList();
		List list = null;
		if (con instanceof List) {	//类型安全
			list = (List) con;
			System.out.println(list.toString());
		}

	}
}
