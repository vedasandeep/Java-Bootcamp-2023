class Ex4
{
	public static void main(String args[])
	{
		String s=null;
		try
		{			
			System.out.println(s);
		}
		catch(NullPointerException e)
		{
			System.out.println("Catched");
			
		}
		System.out.println("Sucessfully NullPointerException Handled");
	}
}