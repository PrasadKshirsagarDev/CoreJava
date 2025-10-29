package stringclass;

public class Second {

	public static void main(String[] args) {
		
		String str = new String("Welocme");
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='e' || str.charAt(i)=='o') // "||" this sign is Stands for "Or" operator 
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
