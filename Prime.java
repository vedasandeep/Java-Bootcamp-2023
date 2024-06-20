import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{	if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("not Prime number");

	}
}