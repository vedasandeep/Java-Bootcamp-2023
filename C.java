import java.util.Scanner;
class A
{
	void add(int a, int b)
	{
		System.out.println("a+b: "+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("a-b: "+(a-b));
	}
}
class B extends A
{
	void div(int a,int b)
	{
		System.out.println("a/b: "+(a/b));
	}
	void mul(int a,int b)
	{
		System.out.println("a*b: "+(a*b));
	}
}
class C extends B
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a");
		int a=s.nextInt();
		System.out.println("Enter b");
		int b=s.nextInt();
		C v=new C();
		v.add(a,b);
		v.sub(a,b);
		v.mul(a,b);
		v.div(a,b);
	}
}