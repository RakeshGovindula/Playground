#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  //cin.getline(str,100);
  getline(cin,str);
  for(auto i=str.crbegin();i<str.crend();i++)
  {
    cout<<*i;
  }
}