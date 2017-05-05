package test;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test(){
		
		Bing bing = new Bing(10);
		Cat cat = new Cat(bing);
		Dog dog = new Dog(bing);
		System.out.println("���⻹ʣ��"+bing.getCake()+"��");
		cat.catEatCake();
		System.out.println("è���ˣ����⻹ʣ��"+bing.getCake()+"��");
		dog.dogEatCake();
		System.out.println("�����ˣ����⻹ʣ��"+bing.getCake()+"��");
		
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