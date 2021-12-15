#include<iostream>
#include<vector>

using namespace std;

int main()
{
   vector<int> v;// vector size double when it full

   cout<<"size:"<<v.capacity()<<endl;


   v.push_back(2);
   cout<<"size:"<<v.capacity()<<endl;

   v.push_back(23);
   cout<<"size:"<<v.capacity()<<endl;
   
   v.push_back(83);
   cout<<"size:"<<v.capacity()<<endl;

   v.push_back(111);
   cout<<"size:"<<v.capacity()<<endl;

   v.push_back(22);
   cout<<"size:"<<v.capacity()<<endl;


   cout<<"third index:"<<v.at(3)<<endl;

   cout<<"front:"<<v.front()<<endl;
   cout<<"back"<<v.back()<<endl;

   v.pop_back();

for (int i:v )
{
   cout<<i<<endl;


}
cout<<"capacity"<<v.capacity()<<endl;
cout<<"size:"<<v.size()<<endl;
v.clear();
cout<<"capacity"<<v.capacity()<<endl;
cout<<"size:"<<v.size()<<endl;

cout<<"second index"<<v.at(2)<<endl;

      return 0;
}