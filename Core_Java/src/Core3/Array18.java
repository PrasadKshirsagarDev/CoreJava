package Core3;

public class Array18 {

	public static void main(String[] args) {
		int [] num = new int [10];
		
		num[0] = 10;
		num[1] = 15;
		num[2] = 20;
		num[3] = 25;
		num[4] = 30;
		num[5] = 35;
		num[6] = 40;
		num[7] = 45;
		num[8] = 50;
		num[9] = 55;
		
		 int sum =0;
		for(int i = 0; i<10; i++) {
			if (num[i]%2 !=0) {
				sum = sum+num[i];
			}
		}
		System.out.println(sum); 	

	}

}
