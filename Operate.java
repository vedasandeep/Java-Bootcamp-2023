//Switch
import java.util.Scanner;
class Operate
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a");
	int a=s.nextInt();
	System.out.println("Enter b");
	int b=s.nextInt();
	System.out.println("Enter Operation");
	char c=s.next().charAt(0);
	switch(c)
	{
		case '+':
		System.out.println(a+"+"+b+" = "+(a+b));
		break;
		case '-':
		System.out.println(a+"-"+b+" = "+(a-b));
		break;
		case '*':
		System.out.println(a+"*"+b+" = "+(a*b));
		break;
		case '/':
		System.out.println(a+"/"+b+" = "+(a/b));
		break;
		case '%':
		System.out.println(a+"%"+b+" = "+(a%b));
		break;
		default:
		System.out.println("Invalid Operator");
	}	
}
}