import java.lang.*;

class Interface
{
      public static void main(String arg[])
      {
            A1 aobj=new A1();
            aobj.applyBrake();

      }
}


interface Bicycle
{
   int a=45;

  abstract void applyBrake(int decrement);
  abstract void speedup(int increament);
}

abstract class A1 implements Bicycle
{
      void applyBrake()
      {
            System.out.println("speed decrease");
      }

      
}

