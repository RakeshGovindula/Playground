#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  string str;
  while(n--)
  {
    cin>>str;
    int flag=0;
    for(int i=97,a=1;i<=122;i++,a++)
    {
      int count=0;
      for(int j=0;j<str.length();j++)
      {
        if(str[j]==i)
          count++;
      }
      if(a!=count && count>0)
        flag=1;
    }
    if(flag)
      cout<<"NO ";
    else
      cout<<"YES ";
  }
    return 0;
}