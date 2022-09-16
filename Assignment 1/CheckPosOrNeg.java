import java.util.Scanner;  
class CheckPosOrNeg
{  
	public static void main(String[] args)   
	{  
	int num;  
	Scanner sc = new Scanner(System.in);  
	System.out.println("Check whether number is Positive or negative : ");  
	System.out.print("Enter a number: ");  
 
	num = sc.nextInt();  
 
	if(num>0)  
	{  
		System.out.println("The number is positive.");  
	}  
	else if(num<0)  
	{  
		System.out.println("The number is negative.");  
	}  
	else  
	{  
		System.out.println("The number is zero.");  
	}  
	}  
}  