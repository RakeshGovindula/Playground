#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  cin>>n;
  int i,j,k;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0){
  for(j=1;j<n;j++)
  {
    k=i;
  cout<<i;
  }
      cout<<++k<<endl;
    }
    else
    {
    cout<<i+1;
      for(j=1;j<n;j++)
      {
      cout<<i;
      }
      cout<<endl;
    }
  }
    return 0;
}