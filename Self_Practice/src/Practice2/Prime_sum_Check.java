package Practice2;

public class Prime_sum_Check {

	public static void main(String[] args) {
		// check whether the number is prime and add that prime numbers.
		 
		int sum =0;
		int [] num = new int [20];
		for(int i = 0; i<20; i++)
		{
			num [i] = i+1;
			
			boolean flag = false;
			for(int j=2; j<num[i]; j++)
			{
				
				if (num[i]%j == 0)
				{
					flag= true;
				}
			}
			if(flag == true) {
			System.out.println("Number is Composite: "+num[i]);
		}
			else {
				System.out.println("Number is Prime: "+num[i]);
				sum = sum+num[i];
			}
		}
		System.out.println("The sum of the Given numbers: "+sum);
		
		

	}

}
