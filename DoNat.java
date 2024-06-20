import java.util.Scanner;
class DoNat
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=n);
	}
	
}