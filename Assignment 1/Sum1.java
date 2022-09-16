import java.util.Scanner;
class Sum1{
	// Even and Odd
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	
	if(num % 2 ==0 )
	{
		System.out.println("The given number "+num+" is Even ");
	}
	else
	{
	System.out.println("The given number "+num+" is Odd ");
	}
	
	}
}