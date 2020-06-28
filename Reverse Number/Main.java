#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int i,n,rev=0;
  cin>>n;
  while(n>0)
  {
  i=n%10;
    if(i!=0)
      rev=10*rev+i;
    n=n/10;
  }
  cout<<rev;
	return 0;
}