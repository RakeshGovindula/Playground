#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s;
  cin>>s;
  int i,j,sfact=1,rfact=1;
  int a=2,r=s-2;
  for(i=s;i>s-2;i--)
  {
  sfact=sfact*i;
  }
  
  /*for(j=1;j<r;j++)
  {
  rfact=rfact*1;
  }*/
  int res=sfact/2;
  cout<<res;
}