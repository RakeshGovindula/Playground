#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,mno;
  cin>>i>>j>>mno;
  int a=mno/i;
  int b=mno%i;
  if(b==1)
  {
  cout<<"Yes";
  }
  else if(b==0)
  {
  if(a==1 || a==j)
    cout<<"Yes";
    else
      cout<<"No";
  }
  else{
  if((a+1)==1 || (a+1)==j)
    cout<<"Yes";
    else
      cout<<"No";
  }
  
}