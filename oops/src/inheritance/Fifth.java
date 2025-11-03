package inheritance;

public class Fifth {

	public static void main(String[] args) {
		
		Indigo indigo = new Indigo();
		indigo.Human_life();
				
	}

}
class Human_1
{
	public Human_1()
	{
		System.out.println("Hello");
	}
	public void Human_life()
	{
		
	}
	
}
class Aeroplane extends Human_1
{
	public Aeroplane()
	{
		System.out.println("A");
	}
	public Aeroplane(int i)
	{
		this();
		System.out.println("B");
	}
}
class Indigo extends Aeroplane
{
	public Indigo()
	{
		super(14);
		System.out.println("C");
	}
	
}
