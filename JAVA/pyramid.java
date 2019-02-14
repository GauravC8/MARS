class pyramid
{
	public static void main(String[] arg)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("*");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
}