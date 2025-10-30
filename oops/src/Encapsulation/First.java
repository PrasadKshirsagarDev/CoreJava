package Encapsulation;

public class First {

	public static void main(String[] args) {
		
			Animal animal = new Animal();
			animal.setAnimalId(10);
			animal.setAnimalName("Tiger");
			animal.setFoodHabbit("Non-Veg");
			
			System.out.println("Animal id is:" +animal.getAnimalId());
			System.out.println("Animal Name is:"+animal.getAnimalName());
			System.out.println("Animal FoodHabbit is:" +animal.getFoodHabbit());
	}

}
class Animal
{

	private int animalID;
	String animalName;
	String foodHabbit;
	
	public void setAnimalId(int id)
	{
		this.animalID=id;
	}
	public void setAnimalName(String name)
	{
		this.animalName=name;
	}
	public void setFoodHabbit(String habit)
	{
		this.foodHabbit=habit;
	}
	
	public int getAnimalId()
	{
		return this.animalID;
	}
	public String getAnimalName()
	{
		return this.animalName;
	}
	public String getFoodHabbit()
	{
		return this.foodHabbit;
	}
}










