class AddTime
{
	int hours,min,sec;
	
	public AddTime(int hours,int min,int sec)
	{
		this.hours=hours;
		this.min=min;
		this.sec=sec;
	}
	void add(AddTime t)
	{
		this.sec+=t.sec;
		
		if(this.sec > 60)
			this.sec=(this.sec-60);
			this.min++;
			
		this.min+=t.min;
		
		if(this.min>60)
			this.min=(this.min-60);
			this.hours++;
			
		this.hours+=t.hours;
		
	}
	void display()
	{
		System.out.println(this.hours+" : "+this.min+" : "+ this.sec);
	}
public static void main(String[] args)
{
	AddTime t1=new AddTime(10,40,40);
	AddTime t2=new AddTime(5,60,40);
	t1.add(t2);
	System.out.println("Addition of Time");
	t1.display();
}
}