import java.util.List;

class LL
{     private int size=1;
      private Node head;
      class Node
      {
            String data;
            Node next;


            Node(String data)
            {
                  this.data=data;
                  this.next=null;
            }



      }
      public void Addfirst(String data)
      {
            Node newn=new Node(data);
            if(head==null)
            {
                  head=newn;
                  return;
            }

            newn.next=head;
            head=newn;

            size++;
      }
      
      public void AddLast(String data)
      {
            Node temp=head;
            Node newn=new Node(data);
            if(head==null)
            {
                  head=newn;
                  return;
            }

            while(temp.next!=null)
            {
               temp=temp.next;

            }
            temp.next=newn;
            size++;
      }
      public void DeleteFirst()
      {
            if(size==1)
            {
                  head=null;
            }
            else if(size==0)
            {
                  return;
            }
            else
            {
                  head=head.next;

            }
            size--;
      }
      public void DeleteLast()
      {
            Node temp=head;
            if(size==1)
            {
                  head=null;
            }
            else if(size==0)
            {
                  return;
            }
            else
            {
               while(temp.next.next!=null)
               {
                     temp=temp.next;
               }
               temp.next=null;

            }
            size--;
      }
      public void InsertAtPos(String data,int pos)
      {
           
            if((pos<1)||(pos>(size+1)))
            {
                  return;
            }
            if(pos==1)
            {
               Addfirst(data);;
            }
            else if((size+1)==pos)
            {
                  AddLast(data);
            }
            else
            {
                  Node newn=new Node(data);
                  Node temp=head;
                  
                  for(int i=1;i<(pos-1);i++)
                  {
                        temp=temp.next;
                  }
                  newn.next=temp.next;
                  temp.next=newn;

                  size++;


            }
      }


      public void DeleteAtPos(int pos)
      {
           
            if((pos<1)||(pos>(size+1)))
            {
                  return;
            }
            if(pos==1)
            {
               DeleteFirst();
            }
            else if((size+1)==pos)
            {
                  DeleteLast();
            }
            else
            {
                 Node temp=head;
                  for(int i=1;i<(pos-1);i++)
                  {
                        temp=temp.next;
                  }
                  temp.next=temp.next.next;

                  size--;


            }
      }

      public int Size()
      {
         return size;
      }
      public void Display()
      {
            Node temp=head;
           while(temp!=null)
           {
                 System.out.print(temp.data+"->");
                 temp=temp.next;
           }
            System.out.println("Null");
      }



      public static void main(String arg[])
      {
            LL list=new LL();

            list.Addfirst("abc");  
            int ret1=list.Size();
            System.out.println(ret1);

            list.Addfirst("is");
            int ret2=list.Size();
            System.out.println(ret2);

            list.AddLast("Alphabet");
            int ret3=list.Size();
            System.out.println(ret3);

            
            list.Display();
            //list.DeleteLast();
            int ret=list.Size();
            System.out.println(ret);

            list.InsertAtPos("data",1);
          
            list.Display();
            int ret5=list.Size();
            System.out.println(ret5);


            list.DeleteAtPos(2);
            list.Display();

            int ret4=list.Size();
            System.out.println(ret4);

             
      }

}