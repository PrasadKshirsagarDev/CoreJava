package Inheritance_1;

public class First {

	public static void main(String[] args) {
		
		Human human = new Nandini();
		human.Eat();

	}

}
class Human
{
	public void Eat()
	{
		System.out.println("Eating From Human");
	}
	
	/*
	 * METHOD OVERLOADING
	 * Method Overloading mhanje same class madhe same method-name but different parameter.
	 */
	public void Eat(String str)
	{
		
	}
	public void Run()
	{
		
	}
	
}
class Nandini extends Human
{
	/*
	 * METHOD OVERRIDDING
	 * Method Overriding mhanje child class madhe parent class chi same method override karun
	 * tyamadhe changes karane.
	 */
	public void Eat()
	{
		System.out.println("Eating From Nandini");
	}
}




