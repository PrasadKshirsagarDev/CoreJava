package inheritance;

public class First {

	public static void main(String[] args) {
		
//		Human human = new Atharva();
//		human.walk();
//		human.talk();
		
		Atharva at = new Atharva();
		at.walk();
		
	}

}
class Human 
{
	public void walk()
	{
		System.out.println("Walking...");
	}
	public void talk()
	{
		System.out.println("Talking...");
	}
}
class Atharva extends Human
{
	

}
