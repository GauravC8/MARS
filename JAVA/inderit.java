class Employee
{
	protected int eId;
	protected String eName;
	protected String address;
	Employee(int eId,String eName,String address)
	{
		this.eId=eId;
		this.eName=eName;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name : "+eName);
		System.out.println("Employee Id: "+eId);
		System.out.println("Address : "+address);
	}
}
class Manager extends Employee
{
	String department;
	Manager(int id,String name,String addr,String department)
	{
		super(id,name,addr);
		this.department=department;
	}
	public void display()
	{
		super.display();
		System.out.println("Department Assigned : "+ department);
	}
}
class Developer extends Employee
{
	String technology;
	Developer(int id,String name,String addr,String technology)
	{
		super(id,name,addr);
		this.technology=technology;
	}
	public void display()
	{
		super.display();
		System.out.println("Technology work: "+technology);
	}
}


class inherit
{
	public static void main(String[] args)
	{
		Manager m=new Manager(100,"Manager1","Noida","Customer Support");
		Developer d=new Developer(10,"Developer1","Delhi","Advance Java");
		m.display();
		d.display(); 
	}
}