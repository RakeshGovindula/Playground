#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=1,c,i;
  cin>>n;
  if(n==0)
    cout<<a;
  else{
  for(i=3;i<=n;i++)
  {
  c=a+b;
    a=b;
    b=c;
  }
  cout<<b;
}
  
  
}