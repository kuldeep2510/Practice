#include<iostream>
#include<array>

using namespace std;

int main()
{


  array<int,4> a={1,2,3,4};

  int size=a.size();

  for (int i = 0; i <size; i++)
  {
       cout<<a[i]<<"\n";
  }
  
  cout<<"Element at second Index:"<<a.at(2)<<"\n";
  
  cout<<"first elemnt"<<a.front()<<endl;
  cout<<"last elemnt"<<a.back()<<endl;


 array<int,4> Arr={2,3,5,8};

 int size1=Arr.size();

  cout<<"element at second index:"<<Arr.at(2)<<endl;

  cout<<"size of array:"<<size1<<endl;
  


      return 0;
}