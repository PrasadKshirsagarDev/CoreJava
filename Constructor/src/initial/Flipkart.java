package initial;

public class Flipkart {

	public static void main(String[] args) {
		
		
		Order order = new Order("Mahesh","Pune","412110", "7485961230");
		
		order.deliver();
		

	}

}
class Order
{
	String name; 
	String city;
	String pincode;
	String mobile;
	double price;
	String aadhar;
	String pan;
	String vehiclenum;
	
	public Order(String cus_name, String cus_city, String cus_pincode, String cus_mobile)
	{
		this.name=cus_name;
		this.city=cus_city;
		this.pincode=cus_pincode;
		this.mobile=cus_mobile;
	}
	
	public void deliver()
	{
		System.out.println("Order Deliver to: "+this.name);
	}



}
