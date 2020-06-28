#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,res1,res2,i,j;
  cin>>d1>>c1>>d2>>c2;
  res1=d1+d2;
  res2=(c1+c2)%100;
  if((c1+c2)>100)
    res1=res1+1;
  for(i=0;i<5;i++);
  for(j=0;j<5;j++);
  cout<<res1<<endl;
  cout<<res2;
}