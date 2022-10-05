import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swapped value of a is : "+a);
		System.out.println("The swapped value of b is : "+b);
	}
}

// Output:
/*
Enter the value of a :
25
Enter the value of b :
36
The swapped value of a is : 36
The swapped value of b is : 25
*/