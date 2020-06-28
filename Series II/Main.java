#include<iostream>
using namespace std;
main()
{
int n;
  cin>>n;
  int a=11,p;
  for(int i=1;i<=n;i++)
  {
  p=a*a;
    a=a+4;
    cout<<p<<" ";
  }
}