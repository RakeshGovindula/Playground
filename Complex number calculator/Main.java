#include<iostream>
using namespace std;
struct{
int i;
  int f;
}s1,s2;
int main()
{
  int ch,x,y;
  cin>>ch;
  cin>>s1.i;
  cin>>s1.f;
  cin>>s2.i;
  cin>>s2.f;
  switch(ch)
  {
    case 1:x=s1.i+s2.i;
      y=s1.f+s2.f;
      if(y<0)
      cout<<x<<y<<"i";
      else
              cout<<x<<"+"<<y<<"i";
      break;
    case 2:x=s1.i-s2.i;
      y=s1.f-s2.f;
      if(y<0)
      cout<<x<<y<<"i";
      else
              cout<<x<<"+"<<y<<"i";
      break;
    case 3:x=s1.i * s2.i - s1.f * s2.f;
      y=s1.i * s2.f + s1.f * s2.f;
      if(y<0)
      cout<<x<<y<<"i";
      else
              cout<<x<<"+"<<y<<"i";
      break;
    default:
      cout<<"Invalid choice";
  }
  
}