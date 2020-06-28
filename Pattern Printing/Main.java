#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int val=10,b=(n*n+1)*10;
  for(int i=n;i>0;i--)
  {
    for(int j=n-i;j>0;j--)
      cout<<"**";
    for(int k=1;k<=i;k++)
    {
      cout<<val;
      val=val+10;
    }
    for(int l=1;l<i;l++)
    {
      cout<<b;
      b=b+10;
    }
    cout<<b/10<<endl;
    b=b-20*(i-1);
  }
    return 0;
}