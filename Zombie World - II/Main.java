#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

int main() 
{
  int b,n;
  cin>>b>>n;
  int z[n];
  for(int i=0;i<n;i++)
    cin>>z[i];
  int x = sizeof(z) / sizeof(z[0]); 
  sort(z,z+x);
  for(int i=0;i<n;i++)
  {
      b=b-((z[i]%2)+(z[i]/2));
  }
  if(b>0)
     cout<<"YES";
  
  else
    cout<<"NO";
   
    return 0;
}