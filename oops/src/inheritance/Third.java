package inheritance;

public class Third {

	public static void main(String[] args) {
		
		//DCE want this as output.
		Mustang mustang = new Mustang(new int [] {12}, Mustang.arr3);
		
		
	}

}
class Mustang
{			
		
		public Mustang(float f)
		{	
			this(new int [] {1});
			System.out.println("C");
		}
		
		public Mustang (int [] arr)
		{
			System.out.println("D");
		}
		
		static int [][] arr3 = new int [1][2];
		public Mustang (int [] arr, int [][] arr3)
		{
			this(1.0f);
			System.out.println("E");
		}
}




