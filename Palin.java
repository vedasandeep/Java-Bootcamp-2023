import java.util.Scanner;
class Palin
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int rem=0,rev=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
}