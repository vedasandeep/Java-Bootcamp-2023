class IareDet
{
	String name;
	int roll;
	static String college="iare";
	IareDet(String n,int roll)
	{
		name=n;
		this.roll=roll;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(roll);
		System.out.println(college);
		System.out.println();
		}
	public static void main(String args[])
	{
		IareDet s1=new IareDet("Vignesh",60);
		IareDet s2=new IareDet("Viabhav",50);
		s1.display();
		s2.display();
		String college="not college";
		System.out.println(college);
	}
}