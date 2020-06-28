#include<iostream>
using namespace std;

int main() 
{
   int n;
  int F,B,T,D;
  cin>>n;
    
  if(n>0){
  for(int i=1;i<=n;i++)
  {
    cin>>F>>B>>T>>D;
    int t=0,r=0;
    if(B<=F ||D<=0||T<=0){
      cout<<"Cannot park\n";
      }
    else if(D<=B)
    {
      t=D*T;
      cout<<t<<endl;
    }
    else{
    while(1)
    {
      r=r+(B-F);
      t=t+(B+F)*T;
      if((r+B)>=D)
      {
        t=t+(D-r)*T;
        break;
      }
    }
    cout<<t<<endl; 
    }
  }
  }
  else
    cout<<"Invalid test case";
   //return 0;
}