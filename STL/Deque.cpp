#include<iostream>
#include<deque>

using namespace std;

int main()
{
   deque<int> d;

   d.push_back(1);
   d.push_front(2);
   d.push_front(3); 
   d.push_front(5);
    d.push_front(6); 
    d.push_front(7);

   d.pop_front();

   



   cout<<"print first index"<<d.at(1)<<endl;

   cout<<"front:"<<d.front()<<endl;
   
   cout<<"back:"<<d.back()<<endl;


   cout<<"empty or not"<<d.empty()<<endl;

   d.erase(d.begin(),(d.begin()+2));

   for(int i:d)
   cout<<i<<" ";
   cout<<endl;

   

   





      return 0;
}