import java.util.*;
class Person
{
	private String name;
	private int age;
	private String constituency;
	Scanner s =new Scanner(System.in);
	
	Person()
	{
		System.out.println("Voter eligiblity app");
		name="";
		age=0;
		constituency="Noida";
	}
	Person(String n,int a)
	{
		name=n;
		age=a;
		constituency="Noida";
	}
	Person(String n,int a,String c)
	{
		name=n;
		age=a;
		constituency=c;
	}
	public void input()
	{
		System.out.println("Enter your name : ");
		name=s.next();
		System.out.println("Enter your age: ");
		age=s.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("COnstituency : "+constituency);
	}
	public void eligiblity()
	{
		if(age>17)
			System.out.println("Person is eligible for vote");
		else
			System.out.println("Person is not eligible for vote");
	}
}
class classDemo
{
	public static void main(String[] argg)
	{
		Person p = new Person();
		Person p1 = new Person("GAURAV",24);
		Person p2 = new Person("ANITA",21);
		p.input();
		p.display();
		p.eligiblity();
		p1.display();
		p1.eligiblity();
		p2.display();
		p2.eligiblity();
	}
}