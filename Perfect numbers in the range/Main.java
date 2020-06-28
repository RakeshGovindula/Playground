#include<iostream>
using namespace std;
main()
{
int m,n,i,j,sum;
  cin>>m>>n;
  for(i=m;i<n;i++)
  {
    sum=0;
  for(j=1;j<i;j++)
  {
  if(i%j==0)
  {
  sum=sum+j;
  }
  }
    if(sum==i)
    cout<<i<<" ";
  }

}