package core2;

public class Finalvariable {

	public static void main(String[] args) {
		final int age = 20;
		
		System.out.println(age);
		System.out.println(Movie.price);

	}

}
class Movie{
	
	String name = "Tarzen";
	static int price = 100;
}