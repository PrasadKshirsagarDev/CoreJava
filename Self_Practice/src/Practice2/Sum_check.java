package Practice2;

public class Sum_check {

	public static void main(String[] args) {
		int [] arr = new int [10];
		
		for(int i=0; i<10; i++)
		{
			arr[i] = i+1;
		}
		int sum = 0;
		for(int j=0; j<10; j++)
		{
			sum = sum+arr[j];
		}
		System.out.println(sum);
	}

}
