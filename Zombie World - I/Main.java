#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

int main() 
{
  int t,n,T,p,d;
  cin>>t;
  while(t--)
  {
    cin>>n>>T;
    
    int arr[n];
    for(int i=0;i<n;i++)
      cin>>arr[i];
    int b = sizeof(arr) / sizeof(arr[0]);
    cin>>p>>d;
    sort(arr,arr+b);
    if(T<n)
    {
      cout<<"NO";
      continue;
    }
    for(int i=0;i<n;i++)
    {
      if(p>=arr[i])
      {
        p=p+(p-arr[i]);
      }
    }
    if(p>=d)
      cout<<"YES";
    else
      cout<<"NO";
  }
   
    return 0;
}