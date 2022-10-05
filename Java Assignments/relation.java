class relation
{
	public static void main(String args[])
	{
		int a=10,b=8;
		int x=20,y=18;
		
		/*
		boolean res=(a==b);
		System.out.println(res);
		
		boolean res1=(a>b);
		System.out.println(res1);
		*/
		/*
		int big= a > b ? x : y;
		System.out.println(big);
		*/
		/*
		if( a > b & x > y)
		{
			System.out.println("big");
		}
		else
		{
			System.out.println("Small");
		}
		*/
		int big = x^y ;
		System.out.println(big);
		
		
	}
}