#include<iostream>
using namespace std;
main()
{
int n;
  cin>>n;
  int i,j,k;
  for(i=1;i<=4;i++)
  {
    
  for(j=1;j<=i;j++)
  {
  cout<<n;
  }
    n++;
    cout<<endl;
  }
  for(i=4;i>=1;i--)
  {
    n--;
  for(j=1;j<=i;j++)
  {
  cout<<n;
  }
    cout<<endl;
  }
}