package Core;

public class Object {

	public static void main(String[] args) {
		
Even d1=new Even();
		
		d1.same();
		
		Odd o1 = new Odd();
		o1.diff();
		
		Demo1 demo = new Demo1();
		demo.demo();
		

	}

}

class Even{
	 public void same() {
		int age = 20;
		for(int i=0;i<=20;i++) {
			if (i%2==0) {
				System.out.println(i);
				System.out.println(age);
			}
		}
	
	 }
}
   
class Odd{
	public void diff(){
		
		for(int i=0;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		
	}
}

class Demo1
{
	public void demo()
	
	{
		System.out.println("demo");
	}
}
