package Core;

public class Demo4 {

	public static void main(String[] args) {
		Aeroplane1 indigo = new Aeroplane1 ();
		indigo.fly();
		System.out.println(indigo.price);
	}

}
class Aeroplane1{
	
	double price=2184512.456;
	
	public void fly() {
		System.out.println("Aeroplane get fly");
	}
}