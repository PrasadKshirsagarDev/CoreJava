package initial;

public class Setter_first {

	public static void main(String[] args) {
		House house = new House(10, "Morya","Gali no.10");
			house.displayhousename();
	}

}

class House
{

	int house_number;
	String house_name;
	String house_lane;
	
	public House(int num, String name, String lane)
	{
		this.house_number=num;
		this.house_name=name;
		this.house_lane=lane;
	}
	public void displayhousename()
	{
		System.out.println("The name of the house is: "+this.house_name);
	}
}
