package Abstraction;

public class Fourth {

	public static void main(String[] args) {
		UPI up = new UPI() {
			public void pay()
			{
				System.out.println("Payment Successfull");
			}
			public void Status()
			{
				System.out.println("Payment Recieved");
			}
			
		};
		up.pay();
		up.Status();

	}

}
interface UPI
{
	void pay();
	void Status();
	
}
//class Phonpe implements UPI
//{
//
//	@Override
//	public void pay() {
//		System.out.println("Payment Successfull");
//		
//	}
//
//	@Override
//	public void Status() {
//		System.out.println("Payment Recieved");
//		
//	}
//	
//}