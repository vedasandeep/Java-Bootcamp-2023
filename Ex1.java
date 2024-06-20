class Ex1
{
	public static void main(String args[])
	{
		try
		{			
			System.out.println(100/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catched");
			
		}
		System.out.println("Sucessfully ArithmeticException Handled");
	}
}