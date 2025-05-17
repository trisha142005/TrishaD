 import java.util.*;
public class Calculate
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter quantity: ");
	int quantity = sc.nextInt();

	System.out.print("Enter unit price: ");
	int unitPrice = sc.nextInt();

	int price = quantity * unitPrice ;
	System.out.println("Total Price: " + price);
	System.out.println("Enter the discount");
	int discount=sc.nextInt();
	int discountAmount =(price*discount)/100;
	double totalPrice=price-discountAmount;
	System.out.println("Total Price: " + totalPrice);
	
	
	}
}