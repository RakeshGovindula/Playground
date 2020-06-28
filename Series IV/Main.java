#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=0,p=2;
  for(int i=1;i<=n;i++)
  {
  if(i==1)
    cout<<a<<" ";
  else if(i==2){
    a=a+p;
    cout<<a<<" ";
  }
   else{ 
     if(i==4){
       a=a+p;
       cout<<a<<" ";
       continue;
     }
     if(i<=3||i==5 ||i%2!=0)
     p=p+4;
   a=a+p;
     cout<<a<<" ";
   
   }
  }
}