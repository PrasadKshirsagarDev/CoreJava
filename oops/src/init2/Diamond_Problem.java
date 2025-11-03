package init2;

public class Diamond_Problem {

	public static void main(String[] args) {
		Universe uni = new Universe();
		uni.dis();
		
		Galaxy gal = new Galaxy();
		gal.dis();
		
		Milkyway mw = new Milkyway();
		mw.dis();

	}

}
class Universe
{	
	String universe_name="ABC";
	public void dis()
	{
		System.out.println(this.universe_name);
	}
}
class Galaxy
{
	String name = "Sage";
	public void dis()
	{
		System.out.println(this.name);
	}
}
class Milkyway extends Universe
{
	public Milkyway()
	{
		super();
	}
}