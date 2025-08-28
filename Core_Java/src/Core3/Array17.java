package Core3;

public class Array17 {

	public static void main(String[] args) {
		int [] arr = new int[10];
		
		for(int i=0; i<10; i++)
		{
			arr[i] = i+11;
		}
		int sum =0;
		for (int i =0; i<10; i++) {
			if (arr[i]%2==0)
			{
				sum = sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
