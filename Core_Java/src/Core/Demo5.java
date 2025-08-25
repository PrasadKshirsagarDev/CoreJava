package Core;

public class Demo5 {

	public static void main(String[] args) {
		Liberary lib = new Liberary();
		lib.read();
		System.out.println(lib.no_of_rooms);

	}

}
class Liberary{
	int no_of_rooms=10;
	public void read() {
		int i =10;
		while(i>5) {
		System.out.println(i);
		i--;
	}
	}
	
}