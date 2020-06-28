#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,s,z;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
  if(b>c){
    s=b;
    z=c;}
    else{
      s=c;
    z=b;}
  }
  else if(b>c)
  {
    if(a>c){
      s=a;
    z=c;}
  else{
    s=c;
    z=a;
    }
  }
  else
  {
    if(a>b){
      s=a;
      z=b;
    }
    else{
      s=b;
      z=a;
  }
  }
  int i,x;
  for(i=1;i<=z;i++)
  {
  if(a%i==0 && b%i==0 && c%i==0)
    x=i;
  }
  cout<<"The treasure is in box which has number "<<s<<endl;
  cout<<"The code to open the box is "<<x;
}