package Core3;

public class Array16 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		arr[0]=12;
		arr[1]=13;
		arr[2]=15;
		arr[3]=17;
		arr[4]=20;
		
//		int highest=0;
//		for (int i=0; i<5; i++)
//		{
//			if(arr[i]>highest);
//			{
//				highest = arr[i];
//			}
//			
//				
//			 
//		}
//		System.out.println(highest);
//
		
		int sum = 0;
		for (int i=0; i<5; i++)
		{
			sum= sum + arr[i];
			
		}
		System.out.println("Sum of all numbers are: " +sum);
}
	
}
