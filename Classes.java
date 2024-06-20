class Classes
{
	char sec;
	int strength;
	String branch;
	int room;
	Classes(char s,int st,String b,int r)
	{
		sec=s;
		strength=st;
		branch=b;
		room=r;
	}
	public void dis()
	{
		System.out.println("Section: "+sec);
		System.out.println("Strength: "+strength);	
		System.out.println("Branch: "+branch);
		System.out.println("Room No: "+room);
		System.out.println();
		
	}
	public static void main(String args[])
	{
		Classes cls1=new Classes('a',60,"it",1409);
		Classes cls2=new Classes('b',50,"ds",1309);
		Classes cls3=new Classes('c',54,"cse",1009);
		cls1.dis();
		cls2.dis();
		cls3.dis();	
	}
}