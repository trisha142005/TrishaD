 import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();
        
     
        double totalPrice = qty * unitPrice;
        
    
        System.out.println("Total price: " + totalPrice);
        
        scanner.close(); 
    }
}
