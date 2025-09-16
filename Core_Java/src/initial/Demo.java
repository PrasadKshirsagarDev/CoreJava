package initial;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car(10.50,20);
		car.display();

	}

}
class Car{
	public void display()
	{
		System.out.println("Display method of car....");
	}
	
	public Car()
	{
		System.out.println("Maza constructor");
	}
	
	public Car(int num)
	{
		System.out.println("Constructor with parameter...");
		System.out.println(num);
	}
	
	public Car(double d, int num )
	{
		System.out.println(d+num);
	}
}

