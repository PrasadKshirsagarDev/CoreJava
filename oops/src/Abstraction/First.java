package Abstraction;

public class First {

	public static void main(String[] args) {

		
		Animal animal = new Elephant();
		animal.eat("Banana");
		
		Animal anm=new Cheetah();
		anm.eat("Grass");
	}

}
abstract class Animal
{
	private String name="123";
	public void run()
	{
		System.out.println("Run Fast");
	}
	
	abstract void eat(String str);
	
	public Animal()
	{
		System.out.println("Hello");
	}
	

}
class Elephant extends Animal
{

	@Override
	void eat(String str) {
		System.out.println("Elephant is eating a:"+str);		
	}
	
}
class Cheetah extends Animal
{

	@Override
	void eat(String str) {
		System.out.println("Cheetah is Eating a:"+str);
	}
	
}






