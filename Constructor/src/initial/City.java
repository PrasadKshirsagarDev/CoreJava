package initial;

public class City {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.setNumber(15);
		bus.setName("Mahalaxmi Travels");
		
		System.out.println("The number of Bus is: "+bus.getNumber());
		System.out.println("The namme of the Bus is: "+bus.getName());
	}

}

class Bus{
	
	int bus_number;
	String bus_name;
	
	public void setNumber(int num)
	{
		this.bus_number=num;
	}
	public void setName(String name)
	{
		this.bus_name=name;
	}
	public int getNumber()
	{
		return this.bus_number;
	}
	public String getName()
	{
		return this.bus_name;
	}
}
