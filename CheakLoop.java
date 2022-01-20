import java.lang.*;





class CheakLoop
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
      
            public void InsertFirst(int data)
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
                  while(temp!=null)
                  {
                        System.out.print(temp.data+"->");
                        temp=temp.next;
                  }
                  System.out.print("null");
            }
      
      
      
      
      




      public static void main(String arg[])
      {
            CheakLoop list=new CheakLoop();

            list.InsertFirst(10);
            list.InsertFirst(20);
            list.InsertFirst(30);
            list.InsertFirst(40);

            list.Display();

      }
}