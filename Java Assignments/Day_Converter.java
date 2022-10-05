import java.util.Scanner;
class Day_Converter
{
	public static void main(String args[])
	{
		int val,temp=0,yr=0,mons=0,d=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of days : ");
		val=sc.nextInt();
		temp=val;
		
		while(temp>0)
		{
			if(temp>365)
			{
				yr++;
				temp=temp-365;
			}
			else if(temp>30)
			{
				mons++;
				temp=temp-30;
			}
			else if(temp>1)
			{
				d++;
				temp=temp-1;
			}
			else
			{
				break;
			}
		}
		System.out.println("The Number of Days Entered : "+val);
		System.out.println("The Number of years : "+yr);
		System.out.println("The Number of months : "+mons);
		System.out.println("The Number of days : "+d);
	
		
	}
}

//Output:
/*
Enter the no of days :
670
The Number of Days Entered : 670
The Number of years : 1
The Number of months : 10
The Number of days : 4
*/