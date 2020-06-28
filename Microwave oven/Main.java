#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  int ch;
  float htime;
  cin>>ch;
  cin>>htime;
  float a=htime;
  switch(ch)
  {
    case 1:       cout<<fixed<<setprecision(2)<<htime;
break;
    case 2: htime=htime+(a/2.0);
      cout<<fixed<<setprecision(2)<<htime;
      break;
    case 3:htime=2.0*a;
            cout<<fixed<<setprecision(2)<<htime;

      break;
    default: cout<<"Number of items is more";
  }
  
}