import com.mooduCommerce.customer.customer;
imprt com.mooduCommerce.order.Order;

public class main
{
	public static void main(String args[])
	{
		Customer customer = new customer("sujan","sujan@gmail.com");
		Order order = new order("ORD123",500);
		System.out.println("---Customer Details---");
		customer.dispalyInfo();
		System.out.println("\n---Order Details---");
		order.displayOrder();
	}
}