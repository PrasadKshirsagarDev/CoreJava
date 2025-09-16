package initial;

public class First {

	public static void main(String[] args) {
		Second second = new Second();
		System.out.println(second.getnum());
	}

}
class Second {
	public Second()
	{
		System.out.println("Inside Constructor");
	}
	public int getnum()
	{
		return 100;
	}
}