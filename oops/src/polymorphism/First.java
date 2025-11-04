package polymorphism;

public class First {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.run();
	}

}
class Animal
{
	
	int age=23;
	
	public void run()
	{
		this.age=35;
		System.out.println("Running Animal");
		System.out.println("age is:"+age);
	}
	public String run(int j)
	{
		System.out.println("Run: 2");
		return null;
	}
	
	public void run(double i, int m)
	{
		System.out.println(age);
		System.out.println("Run: 3");
	}
}