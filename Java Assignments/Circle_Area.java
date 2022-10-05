import java.util.Scanner;
import java.lang.Math;

class Circle_Area
{
	public static void main(String args[])
	{
		
		double pi=3.14,area,circumference,radius;
		System.out.print("Enter the radius of the Circle : ");
		Scanner sc=new Scanner(System.in);
		
		radius=sc.nextDouble();
		
		circumference=2*pi*radius;
		area=pi*Math.pow(radius,2);
		
		System.out.println("The Area of the Circle is : "+(int)area);
		System.out.println("The Circumference of the Circle is : "+(int)circumference);
		
	}
}
// Output:-
/*
Enter the radius of the Circle : 24
The Area of the Circle is : 1808
The Circumference of the Circle is : 150
*/