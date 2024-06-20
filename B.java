class A
{
	void area(int a)
	{
		System.out.println(a*a);
		
	}
	void area(int a,int b)
	{
		System.out.println(a*b);
		
	}
	void area(float a,int b)
	{
		System.out.println(0.5*a*b);
		
	}
	void area(float a,float b)
	{
		System.out.println(a*b);
		
	}
}
class B 
{
	public static void main(String args[])
	{
		A ar=new A();
		ar.area(3);
		ar.area(3,6);
		ar.area(3f,6);
		ar.area(3f,6f);
	}
}