#include <iostream>
using namespace std;
void find(int a[],int b[],int n,int k,int pro)
{
  int temp,max=0,res;
  for(int i=0;i<n;i++)
  {
   if(a[i]*b[i]<0 && b[i]<0)
     temp=(a[i]+2*k)*b[i];
    else if(a[i]*b[i]<0 && a[i]<0)
      temp=(a[i]-2*k)*b[i];
    else if(a[i]*b[i]>0 && a[i]<0)
      temp=(a[i]+2*k)*b[i];
    else if(a[i]*b[i]>0 && a[i]>0)
      temp=(a[i]-2*k)*b[i];
    res=(a[i]*b[i])-temp;
    if(res>max)
      max=res;
  }
  cout<<pro-max;
}

int main() 
{
  int n,k,pro=0;
  cin>>n>>k;
  int a[n],b[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    cin>>b[i];
    pro=pro+(a[i]*b[i]);
  }
  find(a,b,n,k,pro);
   
    return 0;
}