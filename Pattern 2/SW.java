import java.util.Scanner;
class SW
{
	public static void main(String args[])
	{
		
		char vowel;
		System.out.println("Enter the letter: ");
		Scanner sc =new Scanner(System.in);
		vowel=sc.next().charAt(0);
		switch(vowel)
		{
			case 'a':
				System.out.println("a - Vowel ");
			break;	
			case 'e':
				System.out.println("e - Vowel");
			break;
			case 'i':
				System.out.println("i - Vowel");
			break;
			case 'o':
				System.out.println("o - Vowel");
			break;
			case 'u':
				System.out.println("u - Vowel");
			break;
			default:
				System.out.println("Not a vowel");
			break;
		}
	}
}