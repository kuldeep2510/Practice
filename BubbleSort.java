import java.lang.*;
import java.util.Scanner;

class BubbleSort
{
      public static void main(String a[])
      {
            Scanner sobj=new Scanner(System.in);

            System.out.println("Enter size of Array:");
            int size=sobj.nextInt();

            int Arr[]=new int[size];

            System.out.println("Enter elements:");
            for(int i=0;i<Arr.length;i++)
            {
                  Arr[i]=sobj.nextInt();
            }
            BubbleSort bobj=new BubbleSort();
            bobj.Sorting(Arr);

            bobj.Display(Arr);

      }

      public void Sorting(int Arr[])
      {
            int temp=0;
            for(int j=0;j<Arr.length-1;j++)
            {
                  for(int i=0;i<Arr.length-1;i++)
                  {
                        if(Arr[i]>Arr[i+1])
                        {
                              temp=Arr[i+1];
                              Arr[i+1]=Arr[i];
                              Arr[i]=temp;


                        }
                  }
            }

      }
      public void Display(int Arr[])
      {
            
            
                        for (int i=0;i<Arr.length;i++)
                        {
                              System.out.print(Arr[i]+" ");
                        }
            
      }
}

