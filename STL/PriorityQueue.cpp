#include<iostream>
#include<queue>

using namespace std;

int main()
{
      priority_queue <int> maxi;//max heap

      priority_queue<int,vector<int>,greater<int>>mini;//min heap

      maxi.push(21);
      maxi.push(51);
      maxi.push(89);
      maxi.push(78);

  int n=maxi.size();
      for(int i=0;i<n;i++)
      {
            cout<<maxi.top()<<" ";
            maxi.pop();
      }cout<<endl;

      

      




      return 0;
}