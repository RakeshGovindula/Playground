#include <iostream>
using namespace std;

int main() 
{
   int s,r,min,max,count;
  cin>>s>>r;
  int rock[s];
  for(int i=0;i<s;i++)
    cin>>rock[i];
  while(r--)
  {
    count=0;
    cin>>min>>max;
    for(int i=0;i<s;i++)
    {
      if(rock[i]>=min && rock[i]<=max)
        count++;
    }
    cout<<count<<" ";
    
  }
    return 0;
}