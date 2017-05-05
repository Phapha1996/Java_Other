package testThread;

public class TestThread_3 {

	public static void main(String[] args) {

		House house = new House();
		house.setCake(10);
		Thread red = new Thread(house);
		Thread black = new Thread(house);
		red.setName("ºìÂìÒÏ");
		black.setName("ºÚÂìÒÏ");
		red.start();
		black.start();
		
	}

}
