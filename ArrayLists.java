import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


class ArrayLists 
{
  public static void main(String args[])
  {
        ArrayList<Integer> list =new ArrayList<Integer>();
        ArrayList<String> list2=new ArrayList<String>();
        ArrayList<Boolean> list3=new ArrayList<Boolean>();

        list.add(0);
        list.add(1);
        list.add(2);

        list3.add(true);
        list3.add(false);
        list3.add(true);
        list3.add(false);
        list3.add(false);


        System.out.println(list);
        System.out.println(list3);



        //get elements

        int element =list.get(1);

        boolean ele=list3.get(2);

        System.out.println(element);

        System.out.println(ele);


        list.add(0,5);
        System.out.println(list);

        boolean ans=list.contains(6);

        if (ans==true)
        System.out.println("present 6");

        else
        {
         System.out.println("Absent 6");
        }

        list.set(3,35);

        System.out.println(list);


        //size

        int size=list.size();

        System.out.println("Size of Arrylist:"+size);


        for(int i=0;i<size;i++)
        {
          System.out.print(list.get(i));
        }
        System.out.println();

        //SORTING

        Collections.sort(list);

        System.out.println(list);

  }
}