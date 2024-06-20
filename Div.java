import java.util.Scanner;
class Div
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Number");
		int x=scan.nextInt();
		
		if(x%2==0 && x%6==0)
		{
			
			System.out.println("Divisible");
			
		}
		else
		{

			System.out.println("Not Divisible");	
			
		}
	}
}