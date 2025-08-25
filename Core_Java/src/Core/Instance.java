package Core;

public class Instance {

	public static void main(String[] args) {
		Car swift = new Car();
		swift.driving();
		swift.stop();
		
		System.out.println(swift.price);


	}

}

class Car{
	 double price = 353746.145; //Instance variable
	public void driving()
	{
		System.out.println("Car is running...");
		System.out.println(price);
	}
	
	public void stop()
	{
		System.out.println("Car has stopped...");	
		System.out.println(price);
	}
}

