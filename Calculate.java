abstract class Sum
{
	abstract void add();
}
abstract class Main extends Sum
{
	void add(int a)
	{
		a=a+a;
		System.out.println(a);
	}
}
abstract class Maini extends Sum
{
	int add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
}
abstract class Mainii extends Sum
{
	int add(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println(d);
	}
}
class Calculate
{
	public static void main(String args[])
	{
		Sum x=new Main();
		Sum y=new Maini();
		Sum z=new Mainii();
		x.add(2);
		y.add(2,3);
		z.add(2,3,4);
	}
}