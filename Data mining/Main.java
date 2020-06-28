#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j,k,count=0;
  cin>>n;
  int t=n;
  int osum=0,esum=0;
  do{
  n=n/10;
    count++;
  }while(n>0);
  for(i=1;i<=count;i++)
  {
  j=t%10;
  t=t/10;
    if(i%2==0)
      esum=esum+j;
    else
      osum=osum+j;
  }
  if(esum==osum)
    cout<<"Yes";
  else
    cout<<"No";
}