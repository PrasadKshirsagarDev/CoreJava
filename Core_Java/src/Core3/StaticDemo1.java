package Core3;

public class StaticDemo1 {

	public static void main(String[] args) {
		
		Car honda = new Car();
		honda.name="Civic";
		honda.price=1024865.15;
		
		Car ford = new Car();
		ford.name="Mustang";
		ford.price=1243.152;
		
		System.out.println("Honda's car name is: "+honda.name);
		
		System.out.println("Ford's Car name is: "+ford.name);
	}

}
class Car 
{
       String name;
       double price;
}