#include<iostream>
using namespace std;
int gcd(int a,int b)
{
if(a==b)
  return a;
if(a>b)
  return gcd(a-b,b);
else
  return gcd(a,b-a);
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  int g=gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<g;
}