public class ShoppingCart extends Item
{
      public static void main(String arg [])
      {
            ShoppingCart sobj=new ShoppingCart();
            sobj.ShoppingCart();
      }

      private ArrayList<Item> cartItems = new ArrayList<>();


      public void addItem(Item item) 
    {
        cartItems.add(item);
    }
  
    public void removeItem(String itemName)
    {
  
        for (int i = 0; i < cartItems.size(); ++i)
        {
            Item item = cartItems.get(i);
            if (itemName.equals(item.getName()))
            {
                cartItems.remove(i);
            } else
            {
                System.out.println("Item not in the cart. No modification.");
            }
        }
  
    }
  

}