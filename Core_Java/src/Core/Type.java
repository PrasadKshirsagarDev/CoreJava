package Core;

public class Type {

	public static void main(String[] args) {
		Aeroplane aero = new Aeroplane();
		System.out.println(aero.nameaero); // it is instance variable that's why it is written in sysout.
		
		Bus bus = new Bus();
			bus.start(); // it is local variable that's why it is called directly through object.
			
			
		Truck truck = new Truck();
		System.out.println(truck.nametruck);


	}

}

class Aeroplane{
	
	String nameaero = "Boeing..."; //instance (instance means inside the class but outside the method)
}

class Bus{
	public void start() {
		String name = "Leyland"; // local (Local means inside the class and inside the method )
		System.out.println(name);
	}
}

class Truck{
	String nametruck = "Volvo"; // instance
}

