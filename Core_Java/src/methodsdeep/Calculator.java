package methodsdeep;

public class Calculator {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		calc.Addition(15, 20);
		calc.Sub(15.2, 5.1);
		calc.Div(15.3f, 3.4f);
		calc.Multi(15, 4);

	}

}
class Calc
{
public void Addition(int num1, int num2)
{
System.out.println(num1+num2);	
}

public void Sub(double num1, double num2)
{
System.out.println(num1-num2);	
}


public void Div(float num1, float num2)
{
System.out.println(num1/num2);	
}

public void Multi(int num1, int num2)
{
System.out.println(num1*num2);	
}

}
