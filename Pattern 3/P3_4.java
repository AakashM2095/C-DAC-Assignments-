class P3_4
{
	public static void main(String args[])
	{	
	
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}