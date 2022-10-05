import java.util.Scanner;
import java.lang.Math;

class Pra1
{
	public static void main(String args[])
	{
		int val,temp=0,count=0,temo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		val=sc.nextInt();
		
		while(val>0)
		{
			temp=val%10;
			val=val/10;
			count++;	
		}
		for(int i=0;i<count;i++)
		{
			temo=val%10;
			val=val/10;
			temo=(int)(temo*Math.pow(10,i));
			System.out.print(temo+"+");
		}	
			
			
	}
}