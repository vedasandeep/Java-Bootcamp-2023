class Polytest extends A{
    public static void main(String args[])
    {
        A a=new A();
       A a1=new Polytest();//
        A a2=new B();
       // B a3=new A();
        B b=new Polytest();
       // B b1=new B();
       // Polytest b2= new B();
	   a.test();
	   a1.test();
	   a2.test();
	   b.test();
    }
}
class A{
void test(){
    System.out.println("test1");
}
}
class B extends A {
    void test(){
        System.out.println("test2");
    }
}
