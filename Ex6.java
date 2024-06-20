class Ex6
{
	public static void main(String args[])
	{
		try
		{			
			throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Catched");
			
		}
		System.out.println("Sucessfully ClassNotFoundException Handled");
	}
}