#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j,l,m=1,rev=0,count=0;
  cin>>n;
  int a=n*n,x,y;
  i=n;
  int temp=a;
  do
  {
  l=n%10;
    n=n/10;
    count++;
  }while(n>0);
  for(j=1;j<=count;j++)
    m=m*10;
  x=a%m;
  y=a/m;
  if(i==(x+y))
  cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}