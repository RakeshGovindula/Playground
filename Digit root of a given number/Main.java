#include<iostream>
using namespace std;
int sum(int n)
{
int sum=0,a;
  while(n>0)
  {
  a=n%10;
    sum=sum+a;
    n=n/10;
  }
  return sum;
}
int dig(int n)
{
if(n<=9)
  return n;
else{
return dig(sum(n));
} 
  
  
}
main()
{
int n;
  cin>>n;
  int s=dig(n);
  cout<<s;
}