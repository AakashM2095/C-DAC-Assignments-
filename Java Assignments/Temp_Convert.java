//[ formula : C= 5*(f-32)/9 ]
import java.util.Scanner;
class Temp_Convert
{
	public static void main(String args[])
	{
		double F,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fahrenheit value");
		F=sc.nextDouble();
		
		C=(5*(F-32))/9;
		System.out.println("Fahrenheit value : "+F);
		System.out.println("Celsius value : "+C);
	}
}