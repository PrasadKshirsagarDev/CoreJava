package stringclass;

public class First {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Abc");
		
		sb.append("DEF");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
