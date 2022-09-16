class P1_2
{
	public static void main(String args[])
	{
		int alphabet=65; //ASCII value of A is 65
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
}