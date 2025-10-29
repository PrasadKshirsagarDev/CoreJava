package stringclass;

public class Stringbufferex {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("ABC");

		buffer.append("HIJK");
		
		System.out.println(buffer);
		System.out.println(buffer.reverse());
	}

}
