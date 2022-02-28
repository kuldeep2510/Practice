import java.lang.*;

import java.util.Map;
import java.util.*;

class PracticeLL
{
      private Node Head;
      private int size=1;

      class Node
      {
            int data;
            Node next;


            Node(int data)
            {
                  this.data=data;
                  this.next=null;
            }
      }

      public void InserFirst(int data)
      {
            Node newn=new Node(data);

            if(Head==null)
            {
                  Head=newn;
                  return;

            }
            
                  newn.next=Head;
                  Head=newn;
            
            size++;



      }
      public void Display()
      {
            Node temp=Head;

            while(temp!=null)
            {
                  System.out.print(temp.data+"->");

                  temp=temp.next;
            }
            System.out.println("null");
      }
      public void Size()
      {
            System.out.println(size);
      }

      public static void main(String arg[])
      {
            PracticeLL list=new PracticeLL();

            list.InserFirst(21);
            list.InserFirst(32);
            list.InserFirst(45);
            list.InserFirst(78);
            list.InserFirst(89);

            list.Display();
            list.Size();



            Map <String,Integer> obj=new HashMap<>();

            obj.put("kuldeep",1);
            obj.put("Sneha",2);
            obj.put("kavita",3);
            obj.put("Truti",4);


            System.out.println(obj);





      }




     
}
