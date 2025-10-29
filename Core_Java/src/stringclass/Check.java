package stringclass;

public class Check {

	public static void main(String[] args) {
		
		// 1)Contains
		// It checks only the character contains in the given string
		
		String str = new String("Prasad");
		
		boolean result = str.contains("ad");
		System.out.println(result);
		
		// 2)Trim
		// It cuts before and after white space of the string. It can't cut the in between space.
		
		String str1 = new String("     Jan havi ");
		System.out.println(str1);
		System.out.println(str1.trim());
		
		// 3)StartsWith and Endswith
		
		String name = new String("Praniti Sutar");
		String name2 = new String("Janhavi Sutar");
		System.out.println(name.startsWith("Praniti"));
		System.out.println(name2.endsWith("Sutar"));
	}

}
