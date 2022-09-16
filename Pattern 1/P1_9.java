class P1_9
{
	public static void main(String args[])
	{
		int alphabet=65;
		for(int i=0;i<=4;i++) //rows
		{
			for(int j=3;j>=i;j--)// space
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)// printing alphabet
			{
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
}
/*



*/