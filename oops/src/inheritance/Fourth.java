package inheritance;

public class Fourth {

	public static void main(String[] args) {
		Demo demo = new Demo();
		

	}

}
class Demo
{
	public Demo()
	{
		this(10);
		System.out.println("one");
	}
	
	public Demo(int i)
	{
		this(2,4);
		System.out.println("Two");
	}
	
	public Demo(int i, int j)
	{
	
		System.out.println("Three");
	}
	
}


