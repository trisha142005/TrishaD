class Add
{
	static void fun()
	{
		System.out.println("I am inside fun");
		System.out.println("I am feeling good that my program is working");
	}
	public static void main (String args[])
	{
		int a=10;
		int b=15;
		int c;
		
		c=a+b;

		System.out.println("Sum of two numbers ="+ c);
		fun();
	}
}