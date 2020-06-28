#include<iostream>
using namespace std;

bool isMagicSquare() {
  int n,count=0;
  cin>>n;
  int b=n*2+1;
  int a[n][n],ar[b],k=0;
  for(int i=0;i<b;i++)
    ar[i]=0;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  int N=n;
  
   int sum_diag = 0,sum_diag_second=0;
   for (int i = 0; i < N; i++)
      sum_diag = sum_diag + a[i][i];
   for (int i = 0; i < N; i++)
      sum_diag_second = sum_diag_second + a[i][N-1-i];
   if(sum_diag!=sum_diag_second)
      return false;
   for (int i = 0; i < N; i++) {
      int rowSum = 0;
      for (int j = 0; j < N; j++)
         rowSum += a[i][j];
      if (rowSum != sum_diag)
         return false;
   }
   for (int i = 0; i < N; i++) {
      int colSum = 0;
      for (int j = 0; j < N; j++)
         colSum += a[j][i];
      if (sum_diag != colSum)
      return false;
   }
   return true;
}
int main()
{
  //Type your code here.
  /*int n,count=0;
  cin>>n;
  int b=n*2+1;
  int a[n][n],ar[b],k=0;
  for(int i=0;i<b;i++)
    ar[i]=0;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  //int sumr=0,sumc=0;
  //for(int k=0;k<b;k++){
  /*for(int i=0;i<n;i++)
  {
    
    for(int j=0;j<n;j++)
  ar[k]=ar[k]+a[i][j];
    k++;
  }
  for(int j=0;j<n;j++)
  {
  for(int i=0;i<n;i++)
    ar[k]=ar[k]+a[i][j];
    k++;
  }
  for(int i=0;i<n;i++)
  {
    
    for(int j=0;j<n;j++)
    {
    if(i==j)
      ar[k]=ar[k]+a[i][j];
    }
  
  }
  for(int i=0;i<b;i++)
  {
    if(ar[i]==ar[i+1])
      count++;
  }
  */
  //cout<<count<<b;
  
  bool x=isMagicSquare();
  if(x)
    cout<<"Yes";
  else
    cout<<"No";
    
    
  //}
  
}