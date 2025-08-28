package Practice2;

public class Odd_sum {

	public static void main(String[] args) {
		int [] num = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i] = i+2;
		}
		int sum = 0;
		for(int j=0; j<10; j++)
		{
			if(num[j]%2 != 0)
			{
				sum = sum+num[j];
			}
		}
		System.out.println(sum);
	}

}
