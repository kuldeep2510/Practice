typedef struct node
{
      int data;
      struct node * next;
      //struct node * prev;
};

typedef struct node NODE;
typedef struct node * PNODE;


class SinglyLL
{
private:
      PNODE first;
     // PNODE last;
     int size;
public:
    SinglyLL();
    void InsertAtPos(int,int);
    void InsertFirst(int);
    void InsertLast(int);
    void DeleteAtPos(int);
    void DeleteFirst(int);
    void DeleteLast(int);
      
};
SinglyLL::InsertFirst(int no)
{
      PNODE newn =new NODE;

      newn->data=no;
      newn->next=NULL;

      if (size==0)
      {
           first=newn;
      }
      else
      {
            newn->next=first;
            first=newn;

      }
      
      
      
}
SinglyLL::InsertLast(int no)
{
      
      PNODE newn =new NODE;
      PNODE temp=first;

      newn->data=no;
      newn->next=NULL;

      if (size==0)
      {
           first=newn;
      }
      else
      {
           while (temp->next!=NULL)
           {
                 temp=temp->next;

           }
           temp->next=newn;

           
      }
}
SinglyLL::DeleteFirst()
{
      PNODE temp=first;
      if (first==NULL)
      {
           return;
      }
      else
      {
            first=first->next;
            delete(temp);
      }
      
}
SinglyLL::DeleteLast()
{
      PNODE temp=first;

      while (temp->next->next!=NULL)
      {
            temp=temp->next;
      }
      delete (temp->next);

      temp->next=NULL;
      
}


SinglyLL::InsertAtPos(int no,int pos)
{
      PNODE newn=new NODE;
      PNODE temp=first;
      newn->data=no;
      newn->next=NULL;

      if ((pos<1) ||(pos<(size+1)))
      {
            return;
      }
      if (pos==1)
      {
           InsertFirst(no);
      }
      else if (pos==size+1)
      {
           InsertLast(no)
      }
      else
      {
            for (int i = 1; i <(pos-1); i++)
            {
                temp=temp->next;
            }
            newn->next=temp->next;
            temp->next=newn;

            
      }
}


SinglyLL::DeleteAtPos(int pos)
{
      PNODE temp=first;
      PNODE targeted=NULL;
      if ((pos<1)||(pos>size))
      {
         return;
      }
      if (pos==1)
      {
         DeleteFirst()
      }
      else if(pos==size)
      {
            DeleteLast()
      }
      else
      {
            for (int i = 1; i < pos; i++)
            {
                temp=temp->next;
            }
            targeted=temp->next;
            temp->next=targeted->next;
            delete targeted;
            
      }
      
      
}


int main()
{
   SinglyLL int obj;

   obj.InsertFirst(11);
   obj.InsertFirst(21);
   obj.InsertFirst(161);
   obj.InsertFirst(81);
   obj.InsertAtPos(53,3);






      return 0;
}