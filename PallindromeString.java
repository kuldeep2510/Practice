import java.lang.*;
import java.util.Scanner;

import javax.sound.sampled.Line;

class PallindromeString
{
      public static void main(String args[])
      {
           int i=0;
            
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter the String:");
            String Line=sobj.nextLine();
             String rev="";
           
          for(i=(Line.length()-1);i>=0;i--)
          {
                rev=rev+Line.charAt(i);
          }

       //   System.out.println(rev);

          if(rev.equals(Line))
          {
                System.out.println("String is pallindrome");
          }
          else
          {
             System.out.println("its not");
          }


            

      }
}
