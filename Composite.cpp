#include<iostream>
using namespace std;


class hello
{
      public:

      int x=0;
      void fun()
      {
            cout<<"inside fun"<<endl;

      }

};
class Demo
{
      public:
      int y=0;
      hello hobj;

      void gun()
      {
            cout<<"inside Demo"<<endl;
      }
};



int main()
{

  Demo dobj;
  dobj.hobj.fun();





      return 0;
}