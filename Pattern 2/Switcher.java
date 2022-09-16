import java.util.Scanner;
class SW
{
	public static void main(String args[])
	{
		char vowel;
		System.out.println("Enter the letter: ");
		Scanner sc =new Scanner(System.in);
		
		switch(vowel)
		{
			case a:
				System.out.println("a");
			break;	
			case e:
				System.out.println("e");
			break;
			case i:
				System.out.println("i");
			break;
			case o:
				System.out.println("o");
			break;
			case u:
				System.out.println("u");
			break;
			default:
				System.out.println("Not a vowel");
			break;
		}
	}
}