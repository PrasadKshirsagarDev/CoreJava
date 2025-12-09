package Abstraction;

public class Third {

	public static void main(String[] args) {
		User user = new User() {
			
			@Override
			void mobile() {
				System.out.println("There are Mobile user");
				
			}
			
			
		};
		user.mobile();

	}

}
abstract class User
{
	
	abstract void mobile();
}

