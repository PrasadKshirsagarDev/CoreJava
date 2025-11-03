package inheritance;

public class Seventh {

	public static void main(String[] args) {
		Lambo urus = new Lambo();
//		urus.start();
		urus.start_car();

	}

}
class SuperCars
{
	String engine=".90 litre";
	String hp;
	
	public void start()
	{
		System.out.println("Car Started");
	}
	public SuperCars()
	{
		this.setHp();
		System.out.println("Parent class Accessed");
	}
	public void setHp()
	{
		this.hp=hp;
	}
	public String getHp()
	{
		return this.hp;
	}
	
}
class Lambo extends SuperCars
{
	String engine_1=super.engine;
	public Lambo()
	{
		System.out.println("Child Class Accessed...");
	}
	public void start_car()
	{
		super.start();
		System.out.println(super.engine);
		System.out.println(this.engine_1);
	}
	
}