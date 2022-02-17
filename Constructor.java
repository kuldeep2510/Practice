import java.lang.*;

class Constructor
{
      public static void main(String arg[])
      {
            Demo dobj=new Demo(1);
            
            Demo obj=new Demo(2);
            dobj.fun("chandrapur");
            
      }
}

class Demo
{
      Demo(int no1,String name)
      {
            int no=no1;

            String nam=name;
            System.out.println("my name is:"+nam+" and my ID number is :"+no);
      }
      Demo(int no1)
      {
            int id=no1;

            System.out.println(id);
      }

      Demo(Demo no2)
      {
            int kd=Demo.no2;

            System.out.println(kd);
      }

      public void fun(String  str)
      {
            System.out.println("my city name is:"+str);
      }
}
