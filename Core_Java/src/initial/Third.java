package initial;

public class Third {

	public static void main(String[] args) {
		
		Fourth fourth = new Fourth(15);
		System.out.println(fourth.display());
		fourth.geet();

	}

}
class Fourth {
	//Non-Parametrized constructor
	public Fourth()
	{
		System.out.println("Non-Parametrized Constructor");
	}
	
	public Fourth(int i)
	{
		System.out.println("Roll Number is "+i);
	}
	
	public String display()
	{
		return "100";
	}
	
	public void geet()
	{
		System.out.println("Welcome...");
	}
}
