import java.util.Scanner;
class UserName
{
	public static void main(String args[])
	{
		String name;
		System.out.print("Enter your name : ");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.println("Welcome "+name);
	}
}

/*
Enter your name : Aakash Malvankar
Welcome Aakash Malvankar
*/