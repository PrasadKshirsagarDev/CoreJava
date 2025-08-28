package core2;

public class Second {

	public static void main(String[] args) {
		Demo7 d = new Demo7();
		d.demo();
		d.eat();
		d.eatary();
	}

}
class Demo7{
	public void demo() {
		System.out.println("Demo...");
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void eatary() {
		System.out.println("going out...");
	}
}


