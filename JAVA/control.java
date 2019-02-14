import java.util.Scanner;
class control
{
	public static void main(String[] ar)
	{
		Scanner sc= new Scanner(System.in);
/*
//compare two number
		int a=3,b=5;
		if(a>b)
			System.out.println("wow!!!!! a is greater");
		else
			System.out.println("wow!!!! b is greater");
		
//even or odd
		System.out.println("Enter the number :");
		int a= sc.nextInt();
		if(a%2==0)
			System.out.println("HURRAY....number is even");
		else
			System.out.println("HURRAY....number is odd");

		
		
//comparation between three number;

		int a=1,b=5,c=2;
		if(a>b && a>c)
			System.out.println("a is greater");
		else if( b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
		

//calculator
		
		System.out.println("Enter the 1st number:");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b=sc.nextInt();
		System.out.println("Enter the operator(+  -  /  *): ");
		char operator=sc.next().charAt(0);
		switch(operator)
		{
			case '+':
					int sum=a+b;
					System.out.println("Addition of numbers is: "+sum);
					break;
			case '-':
					int sub;
					if(a>b)
						sub=a-b;
					else
						sub=a-b;
					System.out.println("Subtraction of numbers is: "+sub);
					break;
			case '*':
					int mul=a*b;
					System.out.println("Multiplication of numbers is: "+mul);
					break;
			case '/':
					float div;
					if(a>b)
						div=(float)a/b;
					else
						div=(float)a/b;
					System.out.println("Division of numbers is: "+div);
					break;
			default:
					System.out.println("Ops!!!  Invalid operator entered");
		}
		
		
//count		
		int count=10;
		while(count>0)
		{
			System.out.println(count);
			count--;
		}
		
//sum of n numbers
		int sum=0;
		System.out.println("Enter the nth number ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
			
		}
		System.out.println("The sum of n number is "+sum);
		

		
//use of do while loop
		String guess;
		do
		{
			System.out.println("Guess my name");
			guess=sc.nextLine();
		}while(!("Gaurav".equalsIgnoreCase(guess)));
		System.out.println("Yoo You have guess my name corrrectly");
		
//even or odd
		int i,n;
		System.out.println("Enter numbers");
		n=sc.nextInt();
		System.out.print("Odd"+"\t");
		System.out.println("Even");
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.print(i+"\t");
			else
				System.out.println(i);
		}
		
		
//single tables
		int j,i,n;
		System.out.print("Enter numbers to print table");
		n=sc.nextInt();
		for(j=1;j<=m;j++)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(n+" x"+i+" = "+(n*i));
			}
		}
		
		
//multiple tables
		int j,i,m;
		System.out.print("Enter numbers of table");
		m=sc.nextInt();
		for(j=1;j<=m;j++)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(j+" x"+i+" = "+(j*i));
			}
			System.out.println();
			
		}
		
		int j,i,n;
		for(j=1;j<=10;j++)
		{
			for(i=1;i<=j;i++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		int j,i,n;
		for(j=10;j>=1;j--)
		{
			for(i=1;i<=j;i++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
*/		
//diamond pattern
		
		int j,i;
		for(j=1;j<=10;j++)
		{
			for(i=10;i>j;i--)
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
		for(j=1;j<=10;j++)
		{
			for(i=0;i<j;i++)
			{
				System.out.print(" ");
			}
			for(i=10;i>=j;i--)
			{
				System.out.print("*");
			}
			for(i=10;i>=j;i--)
			{
				System.out.print("*");
			}
			
		    System.out.println();
		}
		
		/*
//sum of numbers till negative number is entered....use of break
		int sum=0,n;
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n<0)
				break;
			sum=sum+n;
		}
		System.out.println("Sum of number "+sum);
		
	
		
//sum of numbers for positive number is entered...use of continue
		int sum=0,n;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n<0)
				continue;
			sum=sum+n;
		}
		System.out.println("Sum of number "+sum);
		
		*/
		
		
	}
}