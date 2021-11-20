#include<iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE;

class Stack     // Singly Linear Linked List
{
private:
    PNODE first;
    int size;
    
public:
    Stack()
    {
        first = NULL;
        size = 0;
    }
    
    void push(int no)   // InsertFirst()
    {
       PNODE newn=new NODE;
      
      newn->data=no;
      newn->next=NULL;

      if (first==NULL)
      {
          first=newn;
      }
      else
      {
         newn->next=first;
         first=newn;
      }
      size++;
    }
    
    int pop()   // DeleteFirst()
    {
          PNODE temp=first;
          int Data1=0;
       if (first==NULL)
       {
           return 0;
       }
       else
       {
             first=first->next;
             Data1=temp->data;
             delete temp;
              size--;
       }
      

       return Data1;
    }
    
    void Display()
    {
          PNODE temp=first;
          for(int i=1;i<=size;i++)
          {
              printf("|%d-->|",temp->data);
              temp=temp->next;
          }
          printf("\n");
    }
    
    int Count()
    {
        return size;
    }
};

int main()
{
    Stack obj;
    
    obj.push(11);
    obj.push(21);
    obj.push(51);
    obj.push(101);
    
    int iret = obj.pop();       // 101
    cout<<iret<<"\n";                     // 101
    
    obj.Display();          // 51       21      11
    iret = obj.Count();
    
    cout<<"Size of stack is : "<<iret<<"\n";        // 3
    
    return 0;
}
