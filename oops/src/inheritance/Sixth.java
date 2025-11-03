package inheritance;

public class Sixth {

	public static void main(String[] args) {
		Two_Wheeler two = new Two_Wheeler("Splendor");
	}

}
class Vehicle
{
	String name;
	public Vehicle(String nam)
	{
		this.name=nam;
		System.out.println("Value Assigned in the super class: "+name);
	}
}
class Four_Wheeler extends Vehicle
{
	public Four_Wheeler(String nam)
	{
		
		super(nam);
	}
}
class Three_Wheeler extends Four_Wheeler
{
	public Three_Wheeler(String nam)
	{
		super(nam);
	}
}
class Two_Wheeler extends Three_Wheeler
{
	public Two_Wheeler(String nam)
	{
		super(nam);
	}
}