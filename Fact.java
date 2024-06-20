import java.util.Scanner;
class Fact
{
	public static int fat(int r)
	{	int n=(r-1);
		while(n>=1)
		{
			r=r*(n);
			--n;
		}
		return r;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int r=scan.nextInt();
		System.out.println("Factorial is "+fat(r));
	}
}