
import java.lang.Math;

class H1 
{
	static void powerInt(int i,int j)
	{
		int val=(int)(Math.pow(i,j));
		System.out.println(val);
	}
	static void powerDouble(double i,int j)
	{
		double val=Math.pow(i,j);
		System.out.println(val);
	}
}

class NumPow extends H1
{
	public static void main(String args[])
	{		
		powerInt(12,3);
        powerDouble(12.0,3);
        powerInt(156,3);
        powerDouble(17.0,3);		
	}
}
