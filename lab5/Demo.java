package lab5;
class A 
{
	static
	{
		System.out.println("SIB");
	}
	A()
	{
		System.out.println("A constructor");
	}
	A(int x)
	{
		System.out.println("A constructor: " + x);
	}
}
public class Demo 
{
	public static void main(String[] args)
	{
		A a1 = new A(10);
		A a2 = new A(20);
	}
}
