class ThisEx
{
	int a;
	int b;
	void notmain(int a,int b)
	{
		a=a;
		this.b=b;
	}
		public void dis()
		{
			System.out.println(a);
			System.out.println(b);
		}
	static int c;
	static int d;
	void notmai(int c,int d)
	{
		c=c;
		this.c=c;
	}
		public static void disp()
		{
			System.out.println(c);
			System.out.println(d);
		}
	public static void main(String args[])
	{
		ThisEx ob=new ThisEx();
		ob.notmai(4,5);
		disp();
		ThisEx ob2=new ThisEx();
		ob2.notmai(4,5);
		disp();
	}
}