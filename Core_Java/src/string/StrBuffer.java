package string;

public class StrBuffer {

	public static void main(String[] args) {
		
		String str = new String("ABCD");
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.println(str.charAt(i));
		}

	}

}
