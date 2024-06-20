//Switch
import java.util.Scanner;
class Test
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Rate Yourself");
	System.out.println("1.You are Good");
	System.out.println("2.You are Amazing");
	System.out.println("3.You are Better");
	System.out.println("4.You are Best");
	System.out.println("Enter Option: ");
	int c=s.nextInt();
	switch(c)
	{
		case 1:
		if(a!=c)
			System.out.println("Correct");
		break;
		case 2:
		if(a!=c)
			System.out.println("Correct");
		break;
		case 3:
		if(a!=c)
			System.out.println("Correct");
		break;
		case 4:
		if(a!=c)
			System.out.println("Correct");
		break;
		default:
		System.out.println("Y r u Gay");
	}	
}
}