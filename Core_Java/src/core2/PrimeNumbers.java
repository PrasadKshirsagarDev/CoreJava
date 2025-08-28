package core2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 564;
		boolean flag = false;
		
		for(int i=2; i<564; i++)
		{
			if(num%i==0)
			{
			flag = true;
			}
		}
		if(flag==true)
		{
			System.out.println("Composite");
		}
		else {
			System.out.println("Prime");
		}
	}

}
