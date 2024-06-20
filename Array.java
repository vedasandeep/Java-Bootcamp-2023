import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		int sum=0;
		int[] arr={1,2,3,4,5,};		
		System.out.println("Elements");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print(i+" ");
			}
		System.out.println();
		System.out.println("Even index");
		for(int i=0;i<=arr.length;i++)
		{
			if(i%2==0)
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Even elements");
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i])%2==0)
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Sum of elements");
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println(sum);
	
	}
}