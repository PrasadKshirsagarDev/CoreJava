package initial;

public class First {

	public static void main(String[] args) {
		
		Second fourth = new Second();
		
		Second second = new Second(10);
		
		Second third = new Second("Parameterized Constructor");
		
		Second first = new Second(100, "Parameterized",'A');
		
		
		
		

	}

}

class Second
{

	public Second()
	{
		
		System.out.println("Non Parameterized");
	}
	
	public Second(int i)
	{
		System.out.println(i);
	}
	
	public Second(String abc)
	{
		System.out.println(abc);
	}
	
	public Second(int i, String a, char c)
	{
		System.out.println(i);
		System.out.println(a);
		System.out.println(c);
		
	}
	
}
