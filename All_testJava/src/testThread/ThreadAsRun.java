package testThread;

public class ThreadAsRun {

	public static void main(String[] args) {
		//²âÊÔÏß³ÌÍ¬²½ 
		House_2 house = new House_2();
		house.setCake(10);
		Thread red = new Thread(house);
		red.setName("ºìÂìÒÏ");
		Thread black = new Thread(house);
		black.setName("ºÚÂìÒÏ");
		red.start();
		black.start();
	}

}
