#include<iostream>
using namespace std;
main()
{
  //Type your code here.
  int p,r,yr;//40,1,10
  cin>>p>>r>>yr;
  float in,amount,dis,fin;
  in=float((p*r*yr)/100);
  amount=p+in;
  dis=float(in*(0.02));
  fin=amount-dis;
  cout<<in<<endl;
  cout<<amount<<endl;
  cout<<dis<<endl;
  cout<<fin;
}