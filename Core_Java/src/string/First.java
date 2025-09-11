package string;

public class First {

	public static void main(String[] args) {
		Demo d = new Demo();
		
		String num = d.display();
		System.out.println(num+100);
		
		int i = d.returnint();
		System.out.println();
		
		
		char ch = d.returnchar();
		System.out.println();

	}

}

class Demo
{
int age = 20;

public String display()
{
	System.out.println("Hii");
	return "100";
}

public int returnint()
{
	System.out.println("Hiiiiiiiii");
return 10;	
}

public char returnchar()
{
	return 'H';
}

}