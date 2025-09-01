package Practice2;

public class Matrix_sum {

	public static void main(String[] args) {
		int [][] arr = new int [3][3];
		
		int num = 1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=num++;
			}
		}
		
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i==j)
				{
					sum = sum+arr[i][j];
					System.out.print(arr[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Sum:"+sum);
	}

}
