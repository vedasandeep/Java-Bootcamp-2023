import java.util.Scanner;
class Report
{
public static void main(String args[])
{
	Scanner mac=new Scanner(System.in);
	System.out.println("Enter Marks");
	int m=mac.nextInt();
	if(m>=90 && m<=100)
		System.out.println("Outstanding");
	else if(m>=80 && m<=100)
		System.out.println("A+");
	else if(m>=70 && m<=100)
		System.out.println("A");
	else if(m>=60 && m<=100)
		System.out.println("B");
	else if(m>=50 && m<=100)
		System.out.println("C");
	else if(m>=40 && m<=100)
		System.out.println("D");
	else if(m>=0 && m<40)
		System.out.println("Fail");
	else
		System.out.println("Invalid Marks");

		
}
}