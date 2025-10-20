package initial;

public class T2 {

	public static void main(String[] args) {
		Matrix matrix = new Matrix("Pune");
		
		matrix.printcity();
		
		
		Matrix matrix2=new Matrix("Mumbai");
		matrix2.printcity();
				
		

	}

}
class Matrix
{
	String city;
	public Matrix(String city_name)
	{	this.city=city_name;
		System.out.println("Object created");
	}
	public void printcity()
	{
		System.out.println(this.city);
	}
	
}