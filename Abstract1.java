import java.lang.*;

class Abstract1
{
      public static void main(String arg[])
      {
            horse hobj=new horse();

            chicken cobj=new chicken();
           // hobj.walk();
            //hobj.eat();
      }
}
abstract class Animal
{
      Animal()
      {
            System.out.println("inside Animal");
      }
      abstract public void walk();

      public void eat()
      {
            System.out.println("can eat");
      }
}

class horse extends Animal
{
      horse()
      {
            System.out.println("Inside horse");
      }
    public void walk()
    {
          System.out.println("horse walk on 4 legs");
    }
}

class chicken extends Animal
{
      chicken()
      {
            System.out.println("inside chicken");
      }
      public void walk()
      {
            System.out.println("chicken walk on 2 legs");
      }
}