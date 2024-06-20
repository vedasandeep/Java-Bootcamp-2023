class Methods
{
	static int add(int a)
	{
		a=a+a;
		return a;
	}
	static int add(int a,int b)
	{
		int c;
		c=a+b;
	}
		return c;
	static int add(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		return d;
	}
	public static void main(String args[])
	{
		System.out.println("sum of itself:"+add(2));
		System.out.println("sum of two numbers:"+add(2,3));
	}
		System.out.println("sum of three numbers:"+add(2,3,4));
}