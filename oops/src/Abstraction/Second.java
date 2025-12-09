package Abstraction;

public class Second {

	public static void main(String[] args) {
		Ianimal animal = new Tiger();
		animal.sleep(1);
		
	}

}
interface Ianimal
{
	int id=123;
	  
	void sleep(int i);
	void sleep(int i, int j);
	void Jump(String str);
	void hunt(String str);
	
}
interface Idrink
{
	int drink(String str);
}

class Tiger implements Ianimal, Idrink
{

	@Override
	public void sleep(int i) {
		System.out.println("Sleep 1");
		
	}

	@Override
	public void sleep(int i, int j) {
		System.out.println("Sleeping");
		
	}

	@Override
	public void Jump(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hunt(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int drink(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}