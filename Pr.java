import java.util.Scanner;
class Pr
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		for(int a=1;a<=n;a++)
		{
		int count=0;
		for(int i=1;i<=a;i++)
		{	if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.print(a+" ");
		}

	}
}