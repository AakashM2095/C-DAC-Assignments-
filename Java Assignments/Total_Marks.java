import java.util.Scanner;
import java.io.*; 
class Total_Marks
{	
	public static void main(String args[])
	{
		double Percentage;
		double total_Obtained=0,total_Marks=0;
		int[] a1 =new int[5];
		int[] a2 =new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Marks Obtained of te 5 subjects :");
		for(int i=0;i<a1.length;i++)//total_Obtained Input
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Total Marks of te 5 subjects :");
		for(int i=0;i<a2.length;i++)//total_Marks Input
		{
			a2[i]=sc.nextInt();
		}
		
		for(int i=0;i<a1.length-1;i++)//total_Obtained
		{
			total_Obtained=a1[i]+a1[i+1];
		}
		
		for(int i=0;i<a2.length-1;i++)// total_Marks
		{
			total_Marks=a2[i]+a2[i+1];
		}
		
		
		Percentage=(total_Obtained*100)/total_Marks;
		System.out.println("The Sum of the marks obtained is : "+total_Obtained);
		System.out.println("Percentage = "+Percentage+" %");
			
	}
}

// Output:-
/*
Enter the Marks Obtained of te 5 subjects :
99
99
9
99
99
Enter the Total Marks of te 5 subjects :
100
100
10
100
110
The Sum of the marks obtained is : 198.0
Percentage = 94.28571428571429 %
*/