import java.util.ArrayList;
import java.util.Scanner;
  
public class ShoppingCart
{
  
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();
  
    public ShoppingCart()
    {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }
  
    public ShoppingCart(String customerName, String currentDate)
    {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }
  
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
  
    public String getCustomerName()
    {
        return customerName;
    }
  
    public void setDate(String currentDate)
    {
        this.currentDate = currentDate;
    }
  
    public String getDate()
    {
        return currentDate;
    }
  
    public void addItem(ItemToPurchase item) //HAVING TROUBLE PASSING OBJECT THROUGH A PARAMETER
    {
        cartItems.add(item);
    }
  
    public void removeItem(String itemName)
    {
  
        for (int i = 0; i < cartItems.size(); ++i)
        {
            ItemToPurchase item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.remove(i);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
  
    }
  
    public void modifyItem(ItemToPurchase item, String itemName) //FIX!! default values for if statement
    {
        for (int i = 0; i < cartItems.size(); ++i)
        {
            item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.get(i).setName("");
                cartItems.get(i).setDescription("");
                cartItems.get(i).setPrice(20);
                cartItems.get(i).setQuantity(5);
            } else
            {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }
    }
  
    public int getNumItemsInCart()
    {
        int quantity = 0;
        for (int i = 0; i < cartItems.size(); ++i)
        {
            quantity += cartItems.get(i).getQuantity();
        }
        return quantity;
    }
  
    public int getCostOfCart()
    {
        int costOfCart = 0;
        for (int i = 0; i < cartItems.size(); ++i)
        {
            costOfCart += cartItems.get(i).getPrice();
        }
        return costOfCart;
    }
  
    public void printTotal() //FIX!!! Not sure if this is what is expected of method
    {
        for(int i = 0; i < cartItems.size(); i++)
        {
            cartItems.get(i).printItemCost();
        }
        System.out.println("Total: $" + getCostOfCart());
    }
  
    public void printDescription()
    {
        for (int i = 0; i < cartItems.size(); ++i)
        {
            cartItems.get(i).printItemDescription();
        }
    }
  
    public static void printMenu(ShoppingCart cart) //FIX!! Having trouble with passing an object as a parameter
    {
        System.out.println("MENU\na - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("\nChoose an option: ");
  
    }
}