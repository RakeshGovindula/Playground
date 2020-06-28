#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,k,i,sum=0;
  cin>>n;
  k=n;
  while(n>0)
  {
  i=n%10;
    sum=sum+i;
    n=n/10;
  }
  if(k%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
    
}