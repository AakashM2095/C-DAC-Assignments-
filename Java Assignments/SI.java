import java.util.Scanner;
class SI
{
	public static void main(String args[])
	{
		int Simple_Int,Time=0,rate=0,Principal=0,Total_Amt=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount : ");
		Principal=sc.nextInt();
		System.out.println("Enter the rate of Interest : ");
		rate=sc.nextInt();
		System.out.println("Enter the Time for transaction in years : ");
		Time=sc.nextInt();
		
		Simple_Int=(Principal*rate*Time)/100;
		Total_Amt=Principal+Simple_Int;
		
		System.out.println("The Simple interest for the amount "+Principal+" is "+Simple_Int);
		System.out.println("The Total Amount will be "+Total_Amt);
		
	}
}

//Output:
/*
Enter the Principal Amount :
10000
Enter the rate of Interest :
5
Enter the Time for transaction in years :
10
The Simple interest for the amount 10000 is 5000
The Total Amount will be 15000
*/