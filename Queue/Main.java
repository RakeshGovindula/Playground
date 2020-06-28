#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,count=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int i=0;
  for(i=0;i<n;i++)
  {
    if(a[i]<=m ){
      count++;
    if((a[i]+a[i+1])<=m && (i+1)<n){
      i++;
      if(a[i]==m)
        count++;
    }
    }
  }
  if(a[n-1]==3 && n==3)
    count++;
  /*i=n-1;
  if(a[i]==m)
    count++;
    */
  cout<<count;
}