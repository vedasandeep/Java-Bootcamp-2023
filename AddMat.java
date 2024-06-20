import java.util.Scanner;
class AddMat
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows");		
		int r=scan.nextInt();
		System.out.println("Enter no of columns");		
		int c=scan.nextInt();
		int arr1[][]=new int[r][c];
		int arr2[][]=new int[r][c];
		int res[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.println("Enter M1, row "+(i+1)+"column "+(j+1));
			arr1[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.println("Enter M2, row "+(i+1)+"column "+(j+1));
			arr2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix 1");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[0].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Resultant After Addition of Matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				res[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}