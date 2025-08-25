package Core;

public class First {

	public static void main(String[] args) {
		
		int age = 20;
		System.out.println(age);
		
		Demo8 d = new Demo8(); //d is the instance of Demo8.
	    d.demo();
	    d.eat();
	    d.eatary();

	}

}
class Demo8{
	
	public void demo()
	{
		System.out.println("Demo...");
		
	}
	
	public void eat()
	{
		System.out.println("Eating...");
	}
	
	public void eatary()
	{
	System.out.println("Going out...");
	}
}
