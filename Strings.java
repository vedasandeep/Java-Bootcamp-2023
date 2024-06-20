class Strings
{
	public static void main(String args[])
	{
		String s="Hello Konohagakure";
		System.out.println(s);
		String s2="7th Hokage: Naruto";
		System.out.println(s2);
		String s1=s.concat(s2);
		System.out.println(s1);
		int s3=s.length();
		System.out.println(s3);
		String s4=s1.replace("Naruto","Naruto Uzumaki");
		System.out.println(s4);
		char s5=s4.charAt(15);
		System.out.println(s4);
		int s6=s.compareTo(s1);
		System.out.println(s6);
		int s7=s4.compareToIgnoreCase(s2);
		System.out.println(s7);
		boolean s8=s1.startsWith("H");
		System.out.println(s8);
		boolean s9=s1.endsWith("o");
		System.out.println(s9);
		int s10=s1.indexOf("N");
		System.out.println(s10);
		int s11=s1.lastIndexOf("H");
		String s12=s1.substring(6,10);
		System.out.println(s12);
		String s13=s1.toUpperCase();
		System.out.println(s13);
		String s14=s1.toLowerCase();
		System.out.println(s14);
		String s15=s1.trim();
		System.out.println(s15);
		String s16[]=s1.split(" ");
		System.out.println(s16);
		String s17=s1.append("sandeep");
		System.out.println(s17);
		String s18=s1.insert(6,"Sakura is trash");
		
	}
}