import java.util.*;

class AddNumbersInput
{
	public static void main(String args[])
	
	{	
		int a=10;
		int b=15;
		int  c;
		
		scanner sc =new Scanner(System.in);
		System.out.println("enter the first number ");
		a=sc.nextInt();
		System.out.println("enter the second number ");
		b=sc.nextInt();

		c=a+b;
		
		System.out.println("Sum of two numbers = "+ c);
		fun();
	}

}