import java.util.*;
class Student
{
	private String name;
	private int regNo;
	private String department;
	private int marksScience;
	private int marksHindi;
	private int marksMath;
	private int marksEnglish;
	private String result;
	private float percentage;
	public void input()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your name : ");
		name=s.next();
		System.out.println("Enter your regNo: ");
		regNo=s.nextInt();
		System.out.println("Enter your Department name : ");
		department=s.next();
		System.out.println("Enter your Marks obtained in Science: ");
		marksScience=s.nextInt();
		System.out.println("Enter your Marks obtained in Hindi: ");
		marksHindi=s.nextInt();
		System.out.println("Enter your Marks obtained in Maths: ");
		marksMath=s.nextInt();
		System.out.println("Enter your Marks obtained in English: ");
		marksEnglish=s.nextInt();
		
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Registration Number : "+regNo);
		System.out.println("Department Name: "+ department);
		System.out.println("Result obtained : "+result);
	}
	public void result()
	{
		int sum=marksEnglish+marksHindi+marksMath+marksScience;
		percentage=(sum)/4;
		if(percentage>80 || percentage <=100)
		{
			result="A grade";
		}
		else if(percentage>70 || percentage <=80)
		{
			result="B grade";
		}
		else if(percentage>35 || percentage <=70)
		{
			result="C grade";
		}
		else
		{
			result="Fail";
		}
	}
}
class classDemo
{
	public static void main(String[] argg)
	{
		Student p = new Student();
		p.input();
		p.result();
		p.display();
	}
}