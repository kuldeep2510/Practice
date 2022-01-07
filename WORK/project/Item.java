public class Item
{
     
  private String Name;
  private double price;
  private int quantity;

  public Item()
  {
        this.Name="None";
        this.price=0;
        this.quantity=0;
  }

  public Item(String Name,double price,int quantity)
  {
        this.Name=Name;
        this.price=price;
        this.quantity=quantity;
  }

  public String getName()
  {
        return Name;
  }

  public void setName(String Name)
  {
        this.Name=Name;
  }
//////////////////////////////////////////////////////////////
  public double getprice()
  {
        return price;
  }

  public void setprice(double price)
  {
        this.price=price;

  }
  ////////////////////////////////////////////////////////////
  public int getquantity()
  {
        return quantity;
  }

  public void setName(int quantity)
  {
        this.quantity=quantity;
  }


}