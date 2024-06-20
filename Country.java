class Country
{
	String name;
	int cost;
	static String travel="plane";
	static String lang="english";
	Country(String n,int c)
	{
		name=n;
		cost=c;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(cost);
		System.out.println(travel);
		System.out.println(lang);
		System.out.println();
		}
	public static void main(String args[])
	{
		Country c1=new Country("America",6000);
		Country c2=new Country("UK",5000);
		c1.display();
		c2.display();
		
	}
}