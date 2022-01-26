class InsertionSort
{
      public static void main(String a[])
      {
            int Arr[]={50,30,20,10,40};

            InsertionSort Iobj=new InsertionSort();

            
            Iobj.Insertion(Arr);

            for(int i=0;i<Arr.length;i++)
            {
                  System.out.print(Arr[i]+" ");
            }

            
      }

      public void Insertion(int Arr[])
      {
           for(int i=1;i<Arr.length;i++)
           {
                 int temp=Arr[i];
                 int j=i-1;

                 while(j>=0 && Arr[j]>temp)
                 {
                       Arr[j+1]=Arr[j];
                       j--;
                 }
                 Arr[j+1]=temp;
           }
      }
      
}