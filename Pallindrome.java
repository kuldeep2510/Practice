import java.lang.*;
import java.util.Scanner;

class Pallindrome
{
      public static void main(String args[])
      {
            int rev=0;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the number:");
            int iValue=obj.nextInt();
              int iNo=iValue;
            while(iNo!=0)
            {
              int iDigit=iNo%10;
              rev=(rev*10)+iDigit;
               iNo=iNo/10;

            }
           
           if(iValue==rev)
           {
                 System.out.println("Number is Pallindrome");
           }
           else
           {
                 System.out.println("Not a pallindrome");
           }
            
         

            

      }
}
