package Practice;

import java.util.Objects;

public class Third {

	public static void main(String[] args) {
		
		
		
		Animal animal = new Animal();
		animal.id=10;
		animal.name="AB";
		animal.age=15;
		
		Animal animal1 = new Animal();
		animal1.id=10;
		animal1.name="AB";
		animal1.age=15;
		
		System.out.println(animal.hashcode());
		System.out.println(animal1.hashcode());
		
		System.out.println(animal == animal1);

	}

}
class Animal
{
	int id;
	String name;
	int age;
	
	public String getname()
	{
		return this.name;
	}
	public int hashcode()
	{
		return Objects.hash(id,name,age);
	}
	
	
	
	
}