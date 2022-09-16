import java.util.Scanner;
class EvenSeries
{
	public static void main(String args[])
	{
		int i=1;
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter the Final Number : ");
		int num =sc.nextInt();
		
		while(i<=num)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+" ");
			}
			i=i+1;
		}
	}
}