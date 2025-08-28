package Practice2;

public class Highest_check {

	public static void main(String[] args) {
		
		int highest = 0;
		
		int [] num = new int [5];
		
		for (int i=0; i<5; i++ ) {
			num[i] = i+1;
		}
		for(int j=0; j<5; j++)
		{
			if(num[j]>highest) {
				highest = num[j];
			}
		}
		System.out.println(highest);

	}

}
