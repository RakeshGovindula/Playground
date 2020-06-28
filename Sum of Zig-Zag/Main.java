#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n],row1=0,rown=0,rowd=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(int j=0;j<n;j++){
    row1+=a[0][j];
    rown+=a[m-1][j];
  }
  for(int i=1;i<(m-1);i++)
  {
    for(int j=(n-2);j>0;j--)
    {
      if(i==j)
        rowd+=a[i][j];
    }
  }
  int sum=row1+rowd+rown;
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
  
}