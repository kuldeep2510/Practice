import java.lang.*;

class Overriding
{
      public static void main(String arg[])
      {
            Demo dobj=new Demo();
            dobj.fun();
            dobj.gun();

            Kemo kobj=new Kemo();
            kobj.fun();
            kobj.sun();

      }
}

class Demo
{
      public void fun()
      {
            System.out.println("fun of Demo");
      }

      public void gun()
      {
            System.out.println("gun of demo");
      }
}

class Kemo extends Demo
{
      public void sun()
      {
            System.out.println("sun of kemo");
      }
      @Override
      public void fun()
      {
            System.out.println("fun of kemo");
      }
}