#include<iostream>
using namespace std;
main()
{
int e,t,i,sum=0;
cin>>e>>t;
int a=e+t;
for(i=1;i<a;i++)
{
if(a%i==0){
sum=sum+i;
}
}
  if(sum==a)
  {
  cout<<"They can read the message";
  }
  else
    cout<<"They can't read the message";
}