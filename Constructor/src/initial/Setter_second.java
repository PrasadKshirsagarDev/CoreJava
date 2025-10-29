package initial;

public class Setter_second {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		plant.setNumber(10);
		plant.setName("Mango tree");
		plant.Displayname();
		
		System.out.println(plant.number);
		System.out.println(plant.name);
	}

}
class Plant
{

	int number;
	String name;
	
	public void setNumber(int num)
	{
		this.number=num;
	}
	
	public void setName(String nam)
	{
		this.name=nam;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void Displayname()
	{
		System.out.println("The name of the tree is: "+this.getName() );
		System.out.println("The number of the tree is: "+this.getNumber() );
	}
}