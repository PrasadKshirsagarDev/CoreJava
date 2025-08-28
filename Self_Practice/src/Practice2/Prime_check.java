package Practice2;

public class Prime_check {

	public static void main(String[] args) {
		int num = 13;
		boolean value = false;
		
		for (int i=2; i<13; i++)
		{
			if(num% i == 0) {
				value = true;
			}
		}
		if(value == true) {
			System.out.println("Number is composite");
		}
		else {
			System.out.println("number is prime");
		}
		
	}

}
