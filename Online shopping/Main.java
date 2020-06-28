#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int famount,fdis,fship,samount,sdis,sship,aamount,adis,aship;
  cin>>famount>>fdis>>fship>>samount>>sdis>>sship>>aamount>>adis>>aship;
  float ft,st,at;
  float a=float(fdis);
  float b=float(sdis);
  float c=float(adis);
  ft=famount-(famount*float((a/100)))+fship;
  st=samount-(samount*float(b/100))+sship;
  at=aamount-(aamount*float(c/100))+aship;
  cout<<"In Flipkart Rs."<<ft<<endl;
  cout<<"In Snapdeal Rs."<<st<<endl;
  cout<<"In Amazon Rs."<<at<<endl;
  if(ft<=st && ft<=at)
    cout<<"He will prefer Flipkart";
  else if(st<=at)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}