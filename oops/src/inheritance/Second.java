package inheritance;



public class Second {

	public static void main(String[] args) {
		BangalTiger bt = new BangalTiger();
		//Animal animal = new Animal();
		

	}

}
class Animal 
{
	public Animal()
	{
		System.out.println("Invoked...");
	}
	
	public void demo()
	{
		System.out.println("From Animal...");
	}

}
class Tiger extends Animal
{
	public Tiger ()
	{
		System.out.println("Tiger Invoked...");
	}

}
class BangalTiger extends Tiger
{
	public BangalTiger()
	{
		System.out.println("Indian...");
	}
}







