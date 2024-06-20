class testin
{
	static int sq(int n)
	{
			s=n**(1/2);
			if(s*s==n)
				return s;
	}
	public static void main(String args[])
	{	
		s=4;
		System.out.println(sq(s));
	}
}