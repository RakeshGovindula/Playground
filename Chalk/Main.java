#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,ch;
  cin>>n;
  float r,k=n;
  int ndays=n;
  float m;
 r=1/(sqrt(n));
 do{
    m=float(k*r);
  //m=round(m);
  ndays=ndays+m;
   k=m;
  }while(k>0);
  //ch=int(ndays);
  cout<<ndays;
}