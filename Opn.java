import java.util.Scanner;
class Opn
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1st value");
		int x=scan.nextInt();
		System.out.println("Enter 2nd value");
		int y=scan.nextInt();
		System.out.println("Enter 3rd value");
		int z=scan.nextInt();
		System.out.println("X is"+x);
		System.out.println("Y is"+y);
		System.out.println("Z is"+z);
		if(x==y && y==z)
		{
			System.out.println("all are equal");
		}
		else if(x==y)
		{ 
			if(x>z)
			{
			System.out.println("x and y is equal and greater");
			}
			else
			{
			System.out.println("z is Greatest");	
			}
		}
		else if(y==z)
		{
			if(y>x)
			{
			System.out.println("y and z is equal and greater");
			}
			else
			{
			System.out.println("x is Greatest");	
			}
		}
		
		else if(z==x)
		{
			if(z>y)
			{
			System.out.println("x and y is equal and greater");
			}
			else
			{
			System.out.println("y is Greatest");	
			}
		}
		else
		{
			if(x>y && x>z)
			{
			System.out.println("x is greatest");
			}
			else if(y>z)
			{
			System.out.println("y is greatest");
			}
			else
			{
			System.out.println("z is Greatest");	
			}
		}
	}
}