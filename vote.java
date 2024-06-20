
import java.util.Scanner;
class vote
{
	public static void main(String args[])
	{
		Scanner mac=new Scanner(System.in);
		System.out.print("Enter your age:");
		int a=mac.nextInt();
		String y="Yes,Eligible for voting",n="No,Not Eligible for Voting",result;
		result=(a>=18)?y:n;
		System.out.println(result);		
	}
}
