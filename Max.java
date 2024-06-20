import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int max=0;	
		System.out.println("Enter length of array");		
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1));
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[max]<arr[i])
				max=i;
		}
		System.out.println("Max is "+arr[max]);
	}
}