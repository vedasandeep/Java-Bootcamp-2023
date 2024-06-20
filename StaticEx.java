class StaticEx
{
	static int a;
	static int b;
	static int notmain(int a,int b)
	{
		a=a;
		this.b=b;
	}
	public static void main(String args[])
	{
		ThisEx ob=new ThisEx(4,5);
		System.out.println(a);
	}
}