import java.util.Scanner;
class ArrayDemo
{
	public static void main(String[] argument)
	{
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		int sum=0;
		System.out.println("Enter 5 num ");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("The sum of entered number");
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println(sum);
	}
}