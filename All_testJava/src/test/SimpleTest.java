package test;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test(){
		
		Bing bing = new Bing(10);
		Cat cat = new Cat(bing);
		Dog dog = new Dog(bing);
		System.out.println("蛋糕还剩下"+bing.getCake()+"克");
		cat.catEatCake();
		System.out.println("猫吃了，蛋糕还剩下"+bing.getCake()+"克");
		dog.dogEatCake();
		System.out.println("狗吃了，蛋糕还剩下"+bing.getCake()+"克");
		
	}
	
}

class Bing{
	private int cake;
	Bing(int cake){
		this.cake = cake;
	}
	
	public void eatCake(){
		cake--;
	}

	public int getCake() {
		return cake;
	}

	public void setCake(int cake) {
		this.cake = cake;
	}
	
}

class Cat{
	private Bing bing;
	Cat(Bing b){
		bing = b;
	}
	
	public void catEatCake(){
		bing.eatCake();
	}
}

class Dog{
	private Bing bing;
	Dog(Bing b){
		bing = b;
	}
	
	public void dogEatCake(){
		bing.eatCake();
	}
}