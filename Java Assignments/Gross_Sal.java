import java.util.Scanner;

class Gross_Sal
{
	
	public static void main(String args[])
	{
		double basic_Sal;
		System.out.println("Enter the basic salary : ");
		Scanner sc=new Scanner(System.in);
		
		basic_Sal=sc.nextInt();
		sal(basic_Sal);
		
			
	}
	
	public static void sal(double j)
	{
		double HRA,DA,Gross;
		if(j>=10000)
		{
			HRA=2000.0;
			DA=(j*98)/100;
			Gross=j+HRA+DA;
		}
		else
		{
			HRA=(j*10)/100;
			DA=(j*90)/100;
			Gross=j+HRA+DA;
		}
		System.out.println("Employees Gross Salary : "+Gross);
	}
}

// Output:-
/*
Enter the basic salary :
7000
Employees Gross Salary : 14000.0
*/