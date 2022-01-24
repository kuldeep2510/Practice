import java.util.Scanner;

class QuickSort
{
      public static void main(String a[])
      {
            
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter size:");
            int size=sobj.nextInt();
            int Arr[]=new int[size];

            System.out.println("Enter numbers:");
            for(int o=0;o<Arr.length;o++)
            {

               Arr[o]=sobj.nextInt();
            }

            

            QuickSort(Arr, 0, size-1);

            for (int i=0;i<size;i++)
            {
                  System.out.println(Arr[i]);
            }

            
      }

      public static void QuickSort(int Arr[],int low,int high)
      {


            if(low<high)
            {
                  int pindex=partition(Arr,low,high);

                  QuickSort(Arr, low,pindex-1);
                  QuickSort(Arr, pindex, high);
            }


      }
      public static int partition(int Arr[],int low,int high)
      {
            int pindex=Arr[high];

            int i=low-1;

            for(int j=low;j<high;j++)
            {
                  if(Arr[j]<pindex)
                  {
                        i++;

                        //swap
                        int temp=Arr[i];
                        Arr[i]=Arr[j];
                        Arr[j]=temp;
                  }
            }
            i++;
            int temp=Arr[i];
            Arr[i]=pindex;
            Arr[high]=temp;
            return i;
      }
}