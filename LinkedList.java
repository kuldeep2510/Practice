import java.util.Scanner;

class LinkedList
{
      private Node head;
      private int size;

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
      public void Insertfirst(int data)
      {
            Node newn=new Node(data);
            

            if(head==null)
            {
                  head=newn;
                  return;
            }
            else
            {
            newn.next=head;
            head=newn;
            }

      }
      public void Display()
      {
            Node temp=head;
            while(temp.next!=null)
            {
                  System.out.print(temp.data+"->");
                  temp=temp.next;
            }
            System.out.println("null");
      }
      public void Reverse()
      {
            if(head==null ||head.next==null)
            {
                  return;
            }
            Node prevNode=head;
            Node currentNode=head.next;

            while(currentNode!=null)
            {
                  Node nextNode=currentNode.next;

                  //update
                  currentNode.next=prevNode;
                  prevNode=currentNode;
                  currentNode=nextNode;
            }
            head.next=null;
            head=prevNode;

      }
      public int size()
      {
            return size;
      }



      public static void main(String a[])
      {
            LinkedList obj=new LinkedList();
            obj.Insertfirst(10);
            obj.Insertfirst(11);
            obj.Insertfirst(12);
            obj.Insertfirst(13);
            obj.Insertfirst(14);
            obj.Insertfirst(15);
            obj.Insertfirst(17);

            obj.Display();
            obj.Reverse();
            obj.Display();

            Scanner sobj=new Scanner(System.in);

            System.out.println("Enter String");
            String scan=sobj.nextLine();

            System.out.println("string is:"+scan);



            sobj.close();

      }


}



