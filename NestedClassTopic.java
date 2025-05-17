class Outer
{
	int outer_x=100;
	void test()
	{
		inner inner=new inner();
		inner.display();
	}
	class inner
	{ 
		void display()
		{	
			System.out.println("display outer_x="+ outer_x);
		}	
	}
}

class NestedClassTopic
{
	public static void main(String args[])
	{
		Outer out= new Outer();
		out.test();
	}
}