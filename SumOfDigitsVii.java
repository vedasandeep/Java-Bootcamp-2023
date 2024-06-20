import java.util.Scanner;
class SumOfDigitsVii
{
	public static int add(int n)
	{	int sum=0,r=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		while(x>10)
		{
			x=add(x);
		}
		System.out.println(x);
	}
}