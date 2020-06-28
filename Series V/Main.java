#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=11,p=1;
  for(int i=1;i<=n;i++)
  {
  p=a*a;
    a=a+4;
    cout<<p<<" ";
  }
}