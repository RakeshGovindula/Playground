#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c,age;
  cin>>b>>c;
  int bc=100+b;
  int cc;
    cc=200+c;
 
   if(bc>cc)
    age=bc-cc;
  else
    age=cc-bc;
  if(age>100)
    age=age%100;
  cout<<age;
  
}