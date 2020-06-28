#include<iostream>
using namespace std;
main(){
int n;
  cin>>n;
int i,j,p=1;
  float a=0.5;
  for(i=1;i<=n;i++)
  {
    cout<<a<<" ";
    a=a+p;
  p=p*3;
  }

}