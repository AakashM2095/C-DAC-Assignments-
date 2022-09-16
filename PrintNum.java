import java.util.Scanner;
class PrintNum
{
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		PrintList(num);
	}
	public static void PrintList(int num)
	{
	
		if( num <=10)
		{	
			System.out.println("The number is : "+num);
			PrintList(num+1);
		}
	}
}