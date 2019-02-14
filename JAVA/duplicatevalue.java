class dup
{
	public static void main(String[] args)
	{
		int[] ar={10,5,3,21,12,10,4,6,3};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
		}
	}
}