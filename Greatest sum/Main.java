#include<iostream>
using namespace std;
int fmax(int n,int* a)
{
  int max=0,k=0;
  for(int i=0;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i];
      k=i;
    }
  }
 // cout<<max;
  return k+1;
}
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n],rsum[m],rmax=0,csum[n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    int sum=0;
    for(int j=0;j<n;j++)
    {
      //cin>>a[i][j];
      sum+=a[i][j];
    }
    rsum[i]=sum;
  }
  
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
      //cin>>a[i][j];
      sum+=a[j][i];
    }
    csum[i]=sum;
  }
  int g=fmax(m,rsum);
  int b=fmax(n,csum);
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
    cout<<rsum[i]<<" ";
  cout<<endl<<"Row "<<g<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
    cout<<csum[i]<<" ";
  cout<<endl<<"Column "<<b<<" has maximum sum";
  
}