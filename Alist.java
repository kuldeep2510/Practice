import java.lang.*;
import java.util.ArrayList;

class Alist
{
      public static void main(String a[])
      {
           int  Arr[]={20,10,30,50,40};
           for(int i=0;i<Arr.length-1;i++)
           {
                 int smallest=i;
                  for(int j=i+1;j<Arr.length;j++)
                  {
                       
                        if(Arr[smallest]>Arr[j])
                        {
                             smallest=j;
                        }
                        int temp=Arr[i];
                        Arr[i]=Arr[smallest];
                        Arr[smallest]=temp;



                  }
           }
           for(int k=0;k<Arr.length;k++)
           {
                  System.out.print(Arr[k]+"😘💕 ");
           }
           
      }
}