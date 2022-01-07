import java.lang.*;

abstract class Parent
{
      public Parent()
      {
            System.out.println("Constructor of parrant class");

      }
      public void hello()
      {
            System.out.println("Hello");
      }
      abstract public void fun();
} 
abstract class Derived extends Parent
{
     // public void fun()
     public Derived()
     {
           System.out.println("Constructor of derived class");
     } 
   //abstract public void fun();
    

     
}
class Derived2 extends Derived
{
      public void fun()
      {
         System.out.println("Abstract class method");
      }
}
class Abstract
{
      public static void main(String arg[])
      {
         Derived2 dobj=new Derived2();
         dobj.fun();

      }
}