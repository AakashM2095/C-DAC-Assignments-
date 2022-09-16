class P1_13
{
	public static void main(String args[])
	{
		int alphabet=65;
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println();
		}
	}
}
/*

    A
   B B
  C C C
 D D D D
E E E E E

*/