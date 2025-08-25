package Core;

public class Third {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.run();
		animal.eat();



	}

}
class Animal {
	
	public void run() {
		String name = "Tiger"; //local variable
		System.out.println("Animal id running");
		System.out.println(name);
		
	}
	public void eat()
	{
		String food = "grass";
		System.out.println("Rabbit it eating...");
		System.out.println(food);
	}
	
}