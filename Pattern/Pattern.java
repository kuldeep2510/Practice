import java.lang.*;
import java.util.Scanner;

class Pattern

{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter no of stars:");
            int size=sobj.nextInt();

            Pattern obj=new Pattern();
            obj.fun(size);
            


      }

      
      
            public void fun(int size)
            {
                  for (int i=1;i<=size;i++)
                  {
                      for(int j=i;j<size;j++)
                      {
                            System.out.print("  ");

                      }
                      for(int j=1;j<=i;j++)
                      {
                            System.out.print("* ");
                      }
                      for(int j=1;j<i;j++)
                      {
                            System.out.print("* ");
                      }
                      System.out.println();


                  }

            }
           
      
}