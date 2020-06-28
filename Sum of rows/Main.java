#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c],ar[r];
  for(int i=0;i<r;i++)
  {
   ar[i]=0; 
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
      ar[i]+=a[i][j];
    }
    
  }
  for(int i=0;i<r;i++)
    cout<<ar[i]<<endl;
}