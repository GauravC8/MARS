//diamond pattern
class diamond{
public static void main(String[] agrs)
	{	
		int j,i;
		for(j=0;j<=10;j++)
		{
			for(i=10;i>=j;i--)
			{
				System.out.print(" ");
			}
			for(i=0;i<=j;i++)
			{
				if(i%2==0)
					System.out.print("*");
				else
					System.out.print(" * ");
			}
			/*
			for(i=0;i<=j;i++)
			{
				System.out.print("*");
			}*/
			System.out.println();
			
		}
		for(j=0;j<=10;j++)
		{
			for(i=0;i<=j;i++)
			{
				System.out.print(" ");
			}
			for(i=10;i>=j;i--)
			{
				System.out.print("*");
			}
			for(i=10;i>j;i--)
			{
				System.out.print("*");
			}
			
		    System.out.println();
		}
	}
}