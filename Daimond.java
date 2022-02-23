import java.lang.*;
import java.util.Scanner;

class Daimond
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            
            System.out.println("Enter size:");
            int size=sobj.nextInt();

            for(int i=1;i<=size;i++)
            {
                  for(int j=i;j<=size;j++)
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

            for(int k=1;k<size;k++)
            {
                  for(int l=1;l<=k;l++)
                  {
                        System.out.print("  ");
                  }
                  for(int l=k;l<size;l++)
                  {
                        System.out.print("* ");
                  }
                  for(int l=k;l<size;l++)
                  {
                        System.out.print("* ");
                  }
                  System.out.println();
            }
           


      }
}