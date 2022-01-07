import java.lang.*;
import java.util.Scanner;


class Comman
{
      public static void main (String arg[])
      {
          int i=0,j=0; 
        //  
            
       Scanner sobj=new Scanner(System.in);
       

       System.out.println("Enter first Array values:");
       int Size=sobj.nextInt();
       int Array1[]=new int[Size];

       for(i=0;i<Size;i++)
       {
          Array1[i]=sobj.nextInt();
       }

       System.out.println("Enter second Array values:");
       int size=sobj.nextInt();
       int Array2[]=new int[size];

       for(j=0;j<size;j++)
       {
          Array2[j]=sobj.nextInt();
       }

       
      Same1 obj=new Same1();
      int Arr[]=obj.same(Array1,Array2);


      System.out.println(Arr);


      }




}
class Same1
{
      public int[] same(int brr1[],int brr2[])
      {
            
            int krr[]={};
            int size=brr1.length();
            
          for(int i:brr1)
           {
             for(int j:brr2)
             
                   if(brr1[i]==brr2[j])
                   {
                        krr[i]=brr2[j];
                   }
             
            }
            return krr;
      }
}