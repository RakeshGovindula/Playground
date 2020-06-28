#include<iostream>
#include <iomanip>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int tnballs,tscore,noruns,noballs;
  cin>>tnballs>>tscore>>noruns>>noballs;
  float tovers;
  float overf,crunrate,trunrate;
  tovers=tnballs/6.0;
  int a=noballs/6;
  float b=float(noballs%6);
  overf=a+(b/10);
  crunrate=noruns/overf;
  //crunrate = ((float )((int)(crunrate * 100))) / 100;
  trunrate=tscore/tovers;
  cout<<tovers<<"\n";
  cout<<overf<<"\n";
  cout<<fixed<<setprecision(1)<<crunrate<<"\n";
  cout<<fixed<<setprecision(1)<<trunrate<<"\n";
  if(crunrate>=trunrate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}