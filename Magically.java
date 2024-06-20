import java.util.Scanner;
class Magically
{
	public static long add(long n)
	{	
		long rem=0,sum=0,rev=0;
		while(n>0)
		{	
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}
	public static long reverse(long a)
	{
		long rem=0,rev=0;
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
		long y=mac.nextLong();
		long count=0;
		for(long i=1;i<=y;i++)
		{
		if(i==(add(i)*reverse(add(i))))
		{
			count++;
			System.out.println(i);
		
		}
		}
	}
}