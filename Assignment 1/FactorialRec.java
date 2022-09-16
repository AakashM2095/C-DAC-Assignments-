import java.util.Scanner;
class FactorialRec
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Calculate Factorial with Recursion:");
        System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		long factorial= CalFact(num);
		System.out.println("Factorial of the number :"+num+" is :"+factorial);
		
	}
	public static long CalFact(int num)
	{
		if (num >=1)
			return num*CalFact(num - 1);
		else
			return 1;
	}
}