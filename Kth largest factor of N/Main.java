#include <iostream>
#include<cmath>
using namespace std;

main() 
{
  // string z;
  	unsigned int n,k,i,count=0;
  
  cin>>n>>k;
  //cout<<n;
  //n=z.size();
  //unsigned long long  b=n/4,val=0,res;
  //unsigned long long a[b];
  //unsigned long long x=sqrt(n);
  //unsigned long long count=0;
  if(k==1)
    cout<<n;
  else
  {
    count=1;
  for(i=n/2;i>=1;i--)
  {
    if(n%i==0)
    {
      count++;
    }
    if(count==k)
    {
      cout<<i;
      break;
    }
  }
  if(count!=k)
    cout<<1;
  }
  /*if(x==sqrt(n))
    val=(2*count)-1;
  else 
    val=2*count;
  //cout<<val;
  if(k<val)
  {
    if(k<=count)
      res=n/a[k-1];
    else
      res=n/(a[k-count-1]);
    cout<<res;
  }
  else
    cout<<1;
    */
    return 0;
}