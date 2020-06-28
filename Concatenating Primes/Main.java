#include <iostream>
using namespace std;
bool primeornot(int n)
{
  int count=0;
 for(int i=1;i<=n;i++)
 {
   if(n%i==0)
     count++;
 }
  if(count==2)
    return true;
  else
    return false;
}

int main() 
{
   int n,cnt,count=0,res=0;
  cin>>n;
  int k=n/2;
  int a[k];
  for(int i=1;i<=n;i++)
  {
   cnt=0; 
    for(int x=1;x<=i;x++)
    {
      if(i%x==0)
        cnt++;
    }
    if(cnt==2){
      a[count]=i;
      count++;
    }
    
  }
  
  for(int r=0;r<count;r++)
  {
    for(int q=0;q<count;q++)
    {
      int m;
      if(a[q]<10)
        m=(a[r]*10)+a[q];
      else
        m=(a[r]*100)+a[q];
      if(primeornot(m))
        res++;
    }
  }
  cout<<res;
  
    return 0;
}