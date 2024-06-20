import java.util.Scanner;
class Magic
{
	public static int add(int n)
	{	
		int rem=0,sum=0,rev=0;
		while(n>0)
		{	
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}
	public static int reverse(int a)
	{
		int rem=0,rev=0;
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner mac=new Scanner(System.in);
		System.out.println("Enter the Number");
		int y=mac.nextInt();
		if(y==(add(y)*reverse(add(y))))
			System.out.println("Its Magic");
		else
			System.out.println("not Magical");
		
	}
}