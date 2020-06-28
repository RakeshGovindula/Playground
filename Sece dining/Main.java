#include<iostream>
#include<string>
using namespace std;
main()
{
  //Type your code here.
  string el;
  int rail;
  cin>>el;
  cin>>rail;
  if(el=="front"){
  if(rail==1)
    cout<<"Left Handed";
  else
    cout<<"Right Handed";
  }
  else
  {
    if(rail==1)
    cout<<"Right Handed";
  else
    cout<<"Left Handed";
  }
}