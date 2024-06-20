class Ex5
{
	public static void main(String args[])
	{
		try
		{			
			int i=Integer.parseInt("five");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Catched");
			
		}
		System.out.println("Sucessfully NumberFormatException Handled");
	}
}