package polymorphism;

public class Runtime_poly {

	public static void main(String[] args) {
		
		Movie movie = new Simple();
				movie.Showcollection();
	}

}
class Movie
{
	public void Showcollection()
	{
		System.out.println("Collection From Parent");
	}
}
class Simple extends Movie
{
	public void Showcollection()
	{
		System.out.println("Collection from Child");
	}
}