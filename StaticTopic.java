class Person
{
	int age, height;
	static int totalPerson=0;
	
	public static void havingFun()
	{
		System.out.println("Having Fun! It is Sentia afterall");
	}
	
	Person(int a, int h)
	{
		age=a;
		height=h;	
		totalPerson +=1;
	}
}
class StaticTopic
{
	public static void main(String args[])
	{
		Person P1 = new Person(21 , 165);
		Person P2 = new Person(53 , 160); 

		System.out.println("P1.Total Persons:" +P1.totalPerson);
		System.out.println("P2.Total Persons:" +P2.totalPerson);

		Person.havingFun();
		P1.havingFun();
	}
}