package Core3;

public class Array19 {

	public static void main(String[] args) {
		int [] arr = new int [10];
		int sum =0;
		
		for(int i=0; i<10; i++)
		{
			arr[i] = i+10;
			boolean flag = false;
			for(int j=2; j<arr[i];j++)
			{
				if (arr[i]%j == 0)
				{
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println(arr[i]+"Composite ");
			}
			else {
				System.out.println("Prime");
				sum = sum+arr[i];
			}
			
			
		}
		System.out.println("Sum of prime numbers: "+sum);
		
		
		
				
	}

}
