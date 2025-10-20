package Core3;

public class Staticdemo {

	public static void main(String[] args) {
		
		Animal Janu = new Animal();
		Janu.name="Janhavi";
		Janu.age=15;
		Janu.height=130;
		Janu.weight=45;
		Janu.alive();
		
		Animal Khushi = new Animal();
		Khushi.name="Praniti";
		Khushi.age=13;
		Khushi.height=120;
		Khushi.weight=38;
		
		System.out.println("Name is:"+Khushi.name);
		
		System.out.println("Name is"+Janu.name);
	}

}
class Animal 
{
	 static String name;
	int age;
	int height;
	int weight;
	
	public  void alive()
	{
		System.out.println("Yes I'm Alive");
		System.out.println(name);
	}
	
}
