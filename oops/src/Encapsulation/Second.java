package Encapsulation;

public class Second {

	public static void main(String[] args) {
		Instagram user = new Instagram();
		user.setPassword("sheb374");
		System.out.println( user.getPassword());
	}

}
class Instagram
{
	
	String username;
	private String Password;
	
	public void setPassword(String pass)
	{
		if(pass.length()>=8) {
		this.Password=pass;
		
	}
		else {
		System.out.println("Please insert the 8 Digit Password");
	}
	}
	
	public String getPassword()
	{
		return this.Password;
	}
	
}
