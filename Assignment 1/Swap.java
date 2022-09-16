import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Swap without third variable : ");
        System.out.print("Enter the two numbers : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.print(" Numbers before swapping are : "+i+" "+j);	
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.print(" Numbers after swapping are : "+i+" "+j);		
		
	}
}