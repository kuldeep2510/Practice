import java.util.Scanner;

class SelectionSort
{
      public static void main(String a[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("number of elements:");
            int size=sobj.nextInt();
            int Arr[]=new int[size];

            System.out.println("Elements are:");
            for (int i=0;i<Arr.length;i++)
            {
                  Arr[i]=sobj.nextInt();
            }

            SelectionSort obj=new SelectionSort();
            obj.Selectiion(Arr);
            obj.Display(Arr);

      }

      public void Selectiion(int Arr[])
      {
          for(int i=0;i<Arr.length-1;i++)
          {
              int smallest=i;
              for(int j=i+1;j<Arr.length;j++)
              {
                    if(Arr[smallest]>Arr[j])
                    {
                          smallest=j;
                    }
              }
              int temp=Arr[i];
              Arr[i]=Arr[smallest];
              Arr[smallest]=temp;
                      
          }
            
            
      }
      public void Display(int Arr[])
      {
            for(int i=0;i<Arr.length;i++)
            {
                  System.out.print(Arr[i]+" ");
            }
      }

}