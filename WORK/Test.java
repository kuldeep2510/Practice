import java.util.Scanner;
  
public class Test extends ItemToPurchase 
{
  
    private static Scanner input;
 
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        input = new Scanner(System.in);
  
        System.out.println("Enter Customer's Name:");
        cart.setCustomerName(input.nextLine());
        System.out.println("Enter Today's Date:");
        cart.setDate(input.nextLine());
        System.out.println("");
        System.out.println("Customer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getDate());
  
        char choice = 'q';
        do
        {
            ShoppingCart.printMenu(cart);
  
            switch (choice)
            {
                case 'a':
                    ItemToPurchase item = new ItemToPurchase(); // or however you create it
                    cart.addItem(item);
                    break;
                case 'd': //FIX!!
                    System.out.println("Enter item name:");
                    cart.removeItem(input.nextLine());
                    break;
                case 'c':  //FIX!!!
                    cart.getNumItemsInCart();
                    break;
                case 'i':
                    cart.printDescription();
                    break;
                case 'o':
                    cart.printTotal();
                    break;
            }
            choice = input.nextLine().toLowerCase().charAt(0);
        } while (choice != 'q');
    }
}