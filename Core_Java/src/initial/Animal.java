package initial;

public class Animal {

	public static void main(String[] args) {
		Tiger tiger = new Tiger("JAVA is Programming Language");
		

	}

}
class Tiger{
	
	//non-parametrized construction
	public Tiger()
	{
		System.out.println("Non_parametrized Construction");
	}
	
	public Tiger(int i, String j, char c)
	{
		System.out.println("Purchasing value is "+i);
		System.out.println("Language is " +j);
		System.out.println("Division is "+c);
	}
	
	public Tiger(int i, int j)
	{
		System.out.println(i);
		System.out.println(j);
	}
	
	public Tiger(String s)
	{
		System.out.println(s);
	}
}
