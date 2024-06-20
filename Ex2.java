class Ex2
{
	public static void main(String args[])
	{
		String s="hello world";
		try
		{			
			System.out.println(s.charAt(100));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Catched");
			
		}
		System.out.println("Sucessfully StringIndexOutOfBoundsException Handled");
	}
}