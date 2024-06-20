import java.util.Scanner;
class Len
{
	public static void main(String args[])
	{
		System.out.println("Enter the Sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="Please Count Me";
		int count=0;
		int l=s1.length();
		char arr[]=s.toCharArray();
		for(char i:arr)
		{
			count++;
		}
		System.out.println(count);
	}
}