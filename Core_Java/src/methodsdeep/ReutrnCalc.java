package methodsdeep;

public class ReutrnCalc {

	public static void main(String[] args) {
		
		Calc1 cal = new Calc1();
		int result = cal.Addition(10, 10);
		System.out.println("Sum = "+result);
		
		double result1 = cal.Sub(10.5, 5.0);
		System.out.println("Substraction = "+result1);
		
		float result2 = cal.Div(12.5f, 6f);
		System.out.println("Division = "+result2);
		
		int result3 = cal.Mult(15, 2);
		System.out.println("Multiplication = "+result3);
		

	}

}
class Calc1
{
	public int Addition(int a, int b)
	{
		return a+b;
	}
	
	public double Sub(double a, double b)
	{
		return a-b;
	}
	
	public float Div(float a, float b)
	{
		return a/b;
	}
	
	public int Mult(int a, int b)
	{
		return a*b;
	}
	
}
