#include<iostream>
#include<set>
using namespace std;

int main()

{
      set<int> s;

      s.insert(4);
      s.insert(4);
      s.insert(5);
      s.insert(5);
      s.insert(4);
      s.insert(4);
      s.insert(7);
      s.insert(8);

      s.erase(s.begin());

      for(int i:s)
      {
            cout<<i<<" ";
      }cout<<endl;






      return 0;
}