import java.util.Scanner;
class Fib
{
	public static void feb(int n)
	{	
		int r=0,a=1,b=0,count=2,sum=1;
		System.out.print(r+" "+a+" ");
		while(count<n)
		{
			r=a+b;
			b=a;
			a=r;
			sum=sum+r;
			System.out.print(r+" ");
			++count;
		}
		System.out.println();
		System.out.println("Sum is "+sum);
		
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		feb(n);
	}
}