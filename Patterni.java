import java.util.Scanner;
class Patterni
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || (i+j)==(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}