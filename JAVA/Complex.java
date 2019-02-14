class Complex
{
	double real;
	double imaginary;
	
	public Complex(double r,double i)
	{
		real = r;
		imaginary = i;
	}
	void add(Complex obj)
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	void display()
	{
		System.out.println(this.real+"+i"+this.imaginary);
	}
public static void main(String[] args)
{
	Complex o1=new Complex(10.3,50.7);
	Complex o2=new Complex(0.7,10.3);
	Complex o3=new Complex(1,10);
	o1.add(o2);
	System.out.println("Addition of complex number");
	o1.display();
}
}