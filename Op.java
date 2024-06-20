import java.util.Scanner;
class Op
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter x value");
		int x=scan.nextInt();
		System.out.println("Enter y value");
		int y=scan.nextInt();
		System.out.println("Enter z value");
		int z=scan.nextInt();
		
		if(x>y)
		{
			if(z>x)
			{
			System.out.println("Z is greatest");
			}
			else
			{
			System.out.println("x is Greatest");	
			}
		}
		else
		{
			if(z>y)
			{
			System.out.println("Z is greatest");
			}
			else
			{
			System.out.println("y is Greatest");	
			}
		}
	}
}